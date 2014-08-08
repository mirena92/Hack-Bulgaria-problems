package com.hackbulgaria.corejava;

import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class FixSubtitles {
    
    public static void main(String args[]) throws IOException {
        Path filePath = Paths.get("C:\\Users\\RUSHI\\Desktop\\lost.s04e11.hdtv.xvid-2hd.srt");
        FixSubtitles.fixEncoding(filePath);
    }
    
    public static void fixEncoding(Path filePath) throws IOException {
        Path newFilePath = Paths.get("C:\\Users\\RUSHI\\Desktop\\subtitles.html");
        List<String> lines = Files.readAllLines(filePath, Charset.forName("Windows-1251"));
        Files.write(newFilePath, lines, StandardCharsets.UTF_8);
    }
}
