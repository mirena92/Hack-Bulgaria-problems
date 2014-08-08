package com.hackbulgaria.corejava;

import java.io.File;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class SearchDuplicadetFiles {
    
    public static void search (Path path) {
        File[] files = path.toFile().listFiles();
        for(File f : files) {
//            Files.isRegularFile(f); -> Files.readAllBytres
//            Files.isSymbolicLink(f); -> Files.readSymbolicLink(pathOfSymbolicLink)
//            Files.isDirectory(f) -> get files
        }
    }

    
    
    public static void main (String[] args) {
        search(Paths.get("C:\\Users\\RUSHI\\Desktop\\coreJava\\testData"));
    }
}
