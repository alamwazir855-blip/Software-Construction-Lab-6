package com.mycompany.lab6;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Abstraction {

    public static void main(String[] args) {

        // List is an interface
        List<String> students;

        // Using ArrayList
        students = new ArrayList<>();
        students.add("Ali");

        System.out.println("Using ArrayList:");
        System.out.println("Students: " + students);

        // Using LinkedList
        students = new LinkedList<>();
        students.add("Ahmed");

        System.out.println("Using LinkedList:");
        System.out.println("Students: " + students);
    }
}