package com.example.demo.student;

import java.time.LocalDate;
import java.util.Date;

public class Student {
    private long id;
    private String name;
    private String email;
    private LocalDate dob;
    private int age;



    public void setName(String name) {
        this.name = name;
    }

    public Student() {
    }

    public Student(int age, LocalDate dob, String email, String name, long id) {
        this.age = age;
        this.dob = dob;
        this.email = email;
        this.name = name;
        this.id = id;
    }

    public Student(int age, LocalDate dob, String email, String name) {
        this.age = age;
        this.dob = dob;
        this.email = email;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", dob=" + dob +
                ", age=" + age +
                '}';
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public LocalDate getDob() {
        return dob;
    }

    public void setDob(LocalDate dob) {
        this.dob = dob;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
