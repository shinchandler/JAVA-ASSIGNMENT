package ASSIGNMENT;

import java.util.Scanner;

public class Assignment {

    public String studentName;
    public double assignmentMark;
    public double studentMark;
    public double grade;

    public Assignment(String rstudentname, double rstudentmark, double rassignmentmark) {
        studentName = rstudentname;
        studentMark = rstudentmark;
        assignmentMark = rassignmentmark;
    }

    public Assignment() {
        assignmentMark = 100;
    }

    public double studentMark() {
        return studentMark;
    }

    public void calculates(int rstd_marks) {
        if (rstd_marks > assignmentMark) {
            System.out.println("Your Marks is More Than Assignment Marks.");
        } else {
            grade = rstd_marks / assignmentMark * assignmentMark;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Please Enter Student Name : ");
        String studentName = sc.next();
        System.out.print("Please Enter Student Marks : ");
        int studentMark = sc.nextInt();

        Assignment a1 = new Assignment();

        a1.calculates(studentMark);

        if (a1.grade > 85) {
            System.out.println("High Distinction");
        } else if (a1.grade > 75 && a1.grade < 85) {
            System.out.println("Distinction");
        } else if (a1.grade > 65 && a1.grade < 75) {
            System.out.println("Credit");
        } else if (a1.grade > 50 && a1.grade < 65) {
            System.out.println("Credit");
        } else {
            System.out.println("Fail");
        }

    }
}
