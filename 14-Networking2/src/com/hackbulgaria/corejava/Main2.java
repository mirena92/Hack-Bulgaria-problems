package com.hackbulgaria.corejava;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.nio.charset.StandardCharsets;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.Unmarshaller;

import org.codehaus.jettison.json.JSONException;
import org.codehaus.jettison.json.JSONObject;

public class Main2 {
    
    public static void main(String[] args) {
        URL url;
        try {
            url = new URL("https://hackbulgaria.com/api/students/");
            String content = getContent(url);
            JSONObject json = new JSONObject(content);
            
            
        } catch (MalformedURLException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (JSONException e) {
            e.printStackTrace();
        }
    }
    
    public static String getContent(URL url) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(url.openStream()));
        String inputLine;
        StringBuilder content = new StringBuilder();
        while ((inputLine = in.readLine()) != null) {
            content.append(new String(inputLine.getBytes(), StandardCharsets.UTF_8)).append(System.lineSeparator());
        }
        in.close();
        return content.toString();
    }
}
