package com.hackbulgaria.corejava;

import java.util.ArrayList;
import java.util.List;

public class Student {
    public boolean available;
    public List<Course> course = new ArrayList<>();
    public String github;
    public String name;
    
    public Student(boolean available, List<Course> course, String github, String name) {
        super();
        this.available = available;
        this.course = course;
        this.github = github;
        this.name = name;
    }
}
