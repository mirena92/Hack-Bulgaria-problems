package com.hackbulgaria.corejava;

import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

public class WordCountResult {
    
    private int lineCount;
    private int wordCount;
    private int characterCount;
    
    WordCountResult (int lines, int words, int characters) {
        lineCount = lines;
        wordCount = words;
        characterCount = characters;
    }
    
    int getLineCount() {
        return lineCount;
    }
    
    int getWordCount() {
        return wordCount;
    }
    
    int getCharacterCount() {
        return characterCount;
    }
    
    public static WordCountResult wordCount(Path path) throws IOException {
        WordCountResult count;
        int lines, words=0, characters=0;
        List<String> list = Files.readAllLines(path, Charset.defaultCharset());
        lines = list.size();     
        
        for(String s : list) {
            String[] strArray = s.split("[ ]+");
            words+=strArray.length;
            for(String word : strArray) {
                characters+=word.length();
            }
        }
        count = new WordCountResult(lines, words, characters);
        return count;
    }
}
