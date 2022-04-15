package com.soon.design._20_state._01_before;

public class Client {
    public static void main(String[] args) {
        Student student = new Student("world");
        OnlineCourse onlineCourse = new OnlineCourse();

        Student soon = new Student("soon");
        soon.addPrivateCourse(onlineCourse);

        onlineCourse.addStudent(student);
        onlineCourse.changeState(OnlineCourse.State.PRIVATE);

        onlineCourse.addStudent(soon);

        onlineCourse.addReview("hello", student);

        System.out.println(onlineCourse.getState());
        System.out.println(onlineCourse.getStudents());
        System.out.println(onlineCourse.getReviews());
    }
}
