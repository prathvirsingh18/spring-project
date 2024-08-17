package com.springboot.study;

public class Course {
    int id;
    String CourseName;
    String author;
    public Course(int id, String courseName, String author) {
        this.id = id;
        CourseName = courseName;
        this.author = author;
    }

    public int getId() {
        return id;
    }

    public String getCourseName() {
        return CourseName;
    }

    public String getAuthor() {
        return author;
    }

    @Override
    public String toString() {
        return "Course{" +
                "id=" + id +
                ", CourseName='" + CourseName + '\'' +
                ", author='" + author + '\'' +
                '}';
    }
}
