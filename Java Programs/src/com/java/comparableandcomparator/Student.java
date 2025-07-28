package com.java.comparableandcomparator;

import java.util.Comparator;

public class Student{
        private int id;
        private String name;

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Student(int id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public String toString() {
        return "[id:"+id+" name:"+name+"]";
    }

}
