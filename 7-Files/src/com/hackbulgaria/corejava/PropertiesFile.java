package com.hackbulgaria.corejava;

import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class PropertiesFile {

    public static void main(String args[]) throws IOException {
        
        PropertiesFile.parseProperties(Paths.get("C:\\Users\\RUSHI\\Desktop\\MyFile.txt"));
    }
    
    public static Map<String, String> parseProperties (Path path) throws IOException {
        List<String> LinesOfFile = Files.readAllLines(path, Charset.defaultCharset());       
        return PropertiesFile.toMap(LinesOfFile);
    }
    
    private static Map<String, String> toMap (List<String> inputList) {
        
        LinkedHashMap<String, String> map = new LinkedHashMap<>();
        
        for(String s : inputList) {
            s = s.trim();
            if(s.charAt(0)!='#') {              
                int x = s.indexOf('=');
                String key = s.substring(0, x).trim();
                String value = s.substring(x+1).trim();
                map.put(key, value);
            }
        }
        System.out.println(map);
        return map;
    }
}
