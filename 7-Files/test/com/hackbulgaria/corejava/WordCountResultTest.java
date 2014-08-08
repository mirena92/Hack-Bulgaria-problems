package com.hackbulgaria.corejava;

import static org.junit.Assert.*;

import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class WordCountResultTest {
    
    private static Path path;
    private static WordCountResult result;

    @Before
    public void setUp() throws Exception {
        path = Paths.get("C:\\Users\\RUSHI\\Desktop\\TestFile.txt");
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void testWordCountResult() throws IOException {
        result = WordCountResult.wordCount(path);
        assertEquals(4, result.getLineCount());
        assertEquals(44, result.getWordCount());
    }
}
