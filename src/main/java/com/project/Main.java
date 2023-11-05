package com.project;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        List<Person> personList = new ArrayList<>();

        Person person1 = new Person(24); // Hier füge die notwendigen Daten für die Person ein
        Student student1 = new Student(25); // Hier füge die notwendigen Daten für den Studenten ein
        Worker worker1 = new Worker(30, 3000); // Hier füge die notwendigen Daten für den Arbeiter ein

        personList.add(person1);
        personList.add(student1);
        personList.add(worker1);

        System.out.println("Test 1");
        personList.forEach(person -> {
            if (person.getAge() < 30) {
                System.out.println(person);
            }
        });

        System.out.println("Test 2");

        personList.forEach(person -> {
            if(person instanceof Student && person.getAge() < 30){
                System.out.println(person);
            }
        });

        System.out.println("Test 3");
        personList.forEach(person -> {
            if(person instanceof Worker && ((Worker) person).getSalary() > 2000){
                System.out.println(person);
            }
        });

    }
}