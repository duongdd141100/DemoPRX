package com.example.demoxml.entity;

public class Student {

    private Integer id;

    private Integer rollId;

    private String name;

    private String location;

    public Student(Integer id, Integer rollId, String name, String location) {
        this.id = id;
        this.rollId = rollId;
        this.name = name;
        this.location = location;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", rollId=" + rollId +
                ", name='" + name + '\'' +
                ", location='" + location + '\'' +
                '}';
    }

    public Integer getId() {
        return id;
    }

    public Integer getRollId() {
        return rollId;
    }

    public String getName() {
        return name;
    }

    public String getLocation() {
        return location;
    }
}
