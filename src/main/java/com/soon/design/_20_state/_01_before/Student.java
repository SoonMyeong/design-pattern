package com.soon.design._20_state._01_before;

public class Student {
    private String name;

    public Student(String name) {
        this.name = name;
    }

    public void addPrivateCourse(OnlineCourse onlineCourse) {

    }

    public boolean isEnableForPrivateClass(OnlineCourse onlineCourse) {
        return true;
    }

}
