package com.hackbulgaria.corejava;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class FileUtils {

    public static String readFrom(File file) throws IOException {
        return readFrom(file.toPath());
    }

    public static String readFrom(Path path) throws IOException {
        byte[] readBytes = Files.readAllBytes(path);
        String readString = new String(readBytes);
        return readString;
    }

    public static void writeIn(File file, String data) throws IOException {
        writeIn(file.toPath(), data);
    }

    public static void writeIn(Path path, String data) throws IOException {
        Files.write(path, data.getBytes());
    }
}
