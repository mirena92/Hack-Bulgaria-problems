package com.hackbulgaria.corejava;

import static org.junit.Assert.*;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class FileUtilsTest {

    private static Path path;
    private final static String write = "This is test for write and read";

    @Before
    public void setUp() throws Exception {
        path = Paths.get("C:\\Users\\RUSHI\\Desktop\\MyTestFile.txt");
        FileUtils.writeIn(path, write);
    }

    @After
    public void tearDown() throws Exception {
        Files.delete(path);
    }

    @Test
    public void testReadFromPath() throws IOException {
        assertEquals(write, FileUtils.readFrom(path));
    }
}
