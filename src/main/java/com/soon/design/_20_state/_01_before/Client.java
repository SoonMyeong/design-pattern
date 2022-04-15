package com.soon.design._20_state._01_before;

public class Client {
    public static void main(String[] args) {
        Student student = new Student("world");
        OnlineCourse onlineCourse = new OnlineCourse();

        Student soon = new Student("soon");
        soon.addPrivateCourse(onlineCourse);

        onlineCourse.addStudent(student);
        onlineCourse.changeState(OnlineCourse.State.PRIVATE);
    }
}
