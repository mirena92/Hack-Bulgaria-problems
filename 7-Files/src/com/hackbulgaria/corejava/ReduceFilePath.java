package com.hackbulgaria.corejava;

import java.nio.file.Path;
import java.nio.file.Paths;

public class ReduceFilePath {
    
    public static Path reduceFilePath(String str) {
        Path path = Paths.get(str);
        path.normalize();
        return path;
    }
}
