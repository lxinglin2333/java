package com.lxl.collectionDemo;

import java.util.Comparator;
import java.util.Objects;

public class Student1 implements Comparable<Student1> {

    private String name;
    private int stuNo;

    public Student1() {
    }

    public Student1(String name, int stuNo) {
        this.name = name;
        this.stuNo = stuNo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getStuNo() {
        return stuNo;
    }

    public void setStuNo(int stuNo) {
        this.stuNo = stuNo;
    }

    @Override
    public String toString() {
        return "Student1{" +
                "name='" + name + '\'' +
                ", stuNo='" + stuNo + '\'' +
                '}';
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student1 student1 = (Student1) o;
        return stuNo == student1.stuNo &&
                Objects.equals(name, student1.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, stuNo);
    }



    public int compareTo(Student1 o) {
        int result = this.stuNo - o.stuNo;
        result = result == 0 ? this.name.compareTo(o.name) : result;
        return result;
    }
}
