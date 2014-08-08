package com.hackbulgaria.corejava;

import java.io.IOException;
import java.net.Inet4Address;
import java.net.InetAddress;
import java.net.NetworkInterface;
import java.net.SocketException;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Enumeration;
import java.util.List;

public class PrintAllHosts {

    public static void main(String args[]) throws SocketException {
        Enumeration<NetworkInterface> nets = NetworkInterface.getNetworkInterfaces();
        InetAddress inetAddress = null;

        for (NetworkInterface netint : Collections.list(nets))
            if (!netint.isVirtual() && !netint.isLoopback() && netint.isUp()) {
                inetAddress = getIPAddress(netint);
            }
        List<InetAddress> neighbours = getNeighbours(inetAddress);
        for(InetAddress address : neighbours) {
            System.out.println(address);
        }

    }

    public static InetAddress getIPAddress(NetworkInterface netint) throws SocketException {
        Enumeration<InetAddress> inetAddresses = netint.getInetAddresses();
        for (InetAddress inetAddress : Collections.list(inetAddresses)) {
            if (inetAddress instanceof Inet4Address) {
                System.out.printf("InetAddress: %s\n", inetAddress);
                return inetAddress;
            }
        }
        return null;
    }

    public static List<InetAddress> getNeighbours(InetAddress inetAddress) {
        List<InetAddress> list = new ArrayList<>();
        String address = inetAddress.toString().substring(0, inetAddress.toString().lastIndexOf("."));
        InetAddress currentAddress = null;
        for (int i = 0; i < 255; i++) {
            try {
                currentAddress = InetAddress.getByName(String.format("%s%s", address, i));
                currentAddress.isReachable(50);
            } catch (UnknownHostException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return list;
    }
}
