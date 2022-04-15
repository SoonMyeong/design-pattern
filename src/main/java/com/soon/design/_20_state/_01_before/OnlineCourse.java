package com.soon.design._20_state._01_before;

import java.util.ArrayList;
import java.util.List;

public class OnlineCourse {

    public enum State {
        DRAFT, PUBLISHED, PRIVATE
    }

    private State state = State.PRIVATE;
    private List<String> reviews = new ArrayList<>();
    private List<Student> students = new ArrayList<>();

    public void addReview(String review, Student student) {
        if(state == State.PUBLISHED) {
            reviews.add(review);
        }
        if(state == State.PRIVATE && students.contains(student)) {
            reviews.add(review);
        }
        if(state == State.DRAFT) {
            throw new UnsupportedOperationException("드래프트 상태에서는 리뷰 작성 불가합니다.");
        }
    }

    public void addStudent(Student student) {
        if(state == State.PUBLISHED) {
            students.add(student);
        }
        if(state == State.PRIVATE && availableTo(student)) {
            students.add(student);
        }
        if(state == State.DRAFT) {
            throw new UnsupportedOperationException("드래프트 상태에서는 학생을 추가할 수 없습니다.");
        }

        if(students.size() > 1) {
            state = State.PRIVATE;
        }

    }

    private boolean availableTo(Student student) {
         return student.isEnableForPrivateClass(this);
    }

    public void changeState(State newState) {
        state = newState;
    }

    public State getState() {
        return state;
    }

    public List<Student> getStudents() {
        return students;
    }

    public List<String> getReviews() {
        return reviews;
    }
}
