package com.hackbulgaria.corejava;

import java.io.File;
import java.io.IOException;
import java.nio.file.DirectoryStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class BrokenLinks {
 
    public static void isBroken(Path path) throws IOException {

        DirectoryStream<Path> stream = Files.newDirectoryStream(path);
        
        File[] files = path.toFile().listFiles();
        for (File p : files) {
            if (Files.isSymbolicLink(p.toPath())) {
                Path link = Files.readSymbolicLink(p.toPath());
                if (!link.toFile().exists()) {
                    System.out.println(String.format("The link %s is broken ", p.getName()));
                }
            }
        }
    }

    public static void main(String[] args) throws IOException {
        Path path = Paths.get("C:\\Users\\RUSHI\\Documents");
        isBroken(path);
    }
}
