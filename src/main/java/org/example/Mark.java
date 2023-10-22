package org.example;

public class Mark {
    int studentNumber;
    double mark;

    public Mark(int studentNumber, double mark) {
        this.studentNumber = studentNumber;
        this.mark = mark;
    }

    public int getStudentNumber() {
        return studentNumber;
    }

    public double getMark() {
        return mark;
    }

    public void setStudentNumber(int studentNumber) {
        this.studentNumber = studentNumber;
    }

    public void setMark(double mark) {
        this.mark = mark;
    }
}
