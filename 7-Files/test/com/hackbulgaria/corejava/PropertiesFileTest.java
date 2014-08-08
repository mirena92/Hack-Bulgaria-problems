package com.hackbulgaria.corejava;

import static org.junit.Assert.*;

import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Map;

import org.junit.Before;
import org.junit.Test;

public class PropertiesFileTest {

    private static Path path;
    
    @Before
    public void setUp() throws Exception {
        path = Paths.get("C:\\Users\\RUSHI\\Desktop\\MyFile.txt");
    }

    @Test
    public void test() throws IOException {
        Map<String, String> map = PropertiesFile.parseProperties(path);
        assertEquals("b6=b7=b8", map.get("a5"));
        assertEquals("b1", map.get("a1"));
        assertEquals("b9 #comment", map.get("a6"));
    }

}
