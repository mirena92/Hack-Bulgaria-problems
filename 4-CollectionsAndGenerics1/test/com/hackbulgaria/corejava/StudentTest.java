package com.hackbulgaria.corejava;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class StudentTest {

    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void testSortStudent() {
        List<Student> list = new ArrayList<>();
        list.add(new Student(6, "Ivan"));
        list.add(new Student(3, "Lora"));
        list.add(new Student(3, "Ava"));
        list.add(new Student(5, "Misho"));
        list.add(new Student(5, "Lili"));
        Student.sortStudent(list);
        
        assertEquals(list.get(0), new Student(3, "Ava"));
        assertEquals(list.get(1), new Student(3, "Lora"));        
    }
}
