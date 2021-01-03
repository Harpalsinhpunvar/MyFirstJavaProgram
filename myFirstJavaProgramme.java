package com.company;
import java.util.Scanner;

public class Problem {

    public static void main (String [] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Student Name: ");
        String studentName = sc.nextLine();

        System.out.println("Enter Marks of 5 Subjects");

        //Subject 1 Maths
        System.out.println("Enter Maths Marks out of 100");
        byte maths = sc.nextByte();

        //Subject 2 Science
        System.out.println("Enter Science Marks out of 100");
        byte science = sc.nextByte();

        //Subject 3 Computer Science
        System.out.println("Enter Compter Science Marks out of 100");
        byte computerScience = sc.nextByte();

        //Subject 4 Business Analytics
        System.out.println("Enter Business Analytics Marks out of 100");
        byte businessAnalytics = sc.nextByte();

        //Subject 5 Finance
        System.out.println("Enter Finance Marks out of 100");
        byte finance = sc.nextByte();

        int totalMarks = (maths + science + computerScience + businessAnalytics + finance);
        double f = totalMarks;

        System.out.println("CBSC Marksheet of 10th Standard");
        System.out.println("Student Name: " + studentName);

        System.out.println("Maths             : " + maths);
        System.out.println("Science           : " + science);
        System.out.println("Computer Science  : " + computerScience);
        System.out.println("Business Analytics: " + businessAnalytics);
        System.out.println("Finance           : " + finance);

        System.out.println("Total Marks       : " + totalMarks + " Out of 500");
        double percentageMarks = f * 100 / 500;
        System.out.println("Percentage        : " + percentageMarks + " %");

    }
}

