package com.project;

public class Worker extends Person{
    int salary;
    public Worker(int age, int salary){
        super(age);
        this.salary = salary;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Worker{" +
                "age=" + getAge() +
                "salary=" + salary +
                '}';
    }
}
