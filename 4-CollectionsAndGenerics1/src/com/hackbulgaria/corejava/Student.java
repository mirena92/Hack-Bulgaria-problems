package com.hackbulgaria.corejava;

import java.util.Collections;
import java.util.List;

public class Student implements Comparable<Object> {
    
    public int grade;
    public String name;
    
    public Student(int grade, String name) {
        this.grade = grade;
        this.name = name;
    }
    
    @Override
    public int compareTo(Object obj) {
        
        if (obj instanceof Student)
        {
            if(grade>((Student)obj).grade)
                return 1;
            if(grade<((Student)obj).grade)
                return -1;
            if(grade==((Student)obj).grade)
            {
                if(name.compareTo(((Student)obj).name)>0)
                    return 1;
                if(name.compareTo(((Student)obj).name)<0)
                    return -1;
            }
        }
        return 0;
    }
    
    @Override
    public boolean equals(Object obj) {    
        if (obj instanceof Student)
        {
            if(grade==((Student)obj).grade && name.equals(((Student)obj).name))
                return true;            
        }
        return false;
    }
    
    public static List<Student> sortStudent (List<Student> listStudent)
    {
        Collections.sort(listStudent);
        
        return listStudent;
    }
}
