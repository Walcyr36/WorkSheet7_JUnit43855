package org.example;

import java.util.ArrayList;

public class CurricularUnit {

    String ucName;
    static ArrayList<Mark> marks;
    int totalStudents;

    public CurricularUnit(String ucName, int totalStudents) {
        this.ucName = ucName;
        this.marks = new ArrayList<>();
        this.totalStudents = totalStudents;
    }

    public void insertMark(int studentNumber, double mark) {
        if (marks.size() < totalStudents) {
            marks.add(new Mark(studentNumber, mark));
        } else {
            System.out.println("Erro");
        }
    }


    public static double searchStudent(int numStudent) {
        for(Mark mark: marks) {
            if(mark.studentNumber == numStudent) {
                return mark.mark;
            }
        }

        return -1;
    }

    public double averageCU() {

        double totalMarks=0;
        for(Mark mark: marks) {
            totalMarks += mark.mark;
        }
        return totalMarks / marks.size();

    }

    public static boolean isAproved(int numStudent) {
        double mark = searchStudent(numStudent);
        if(mark >= 9.5) {
            return true;
        } else {
            return false;
        }
    }
}
