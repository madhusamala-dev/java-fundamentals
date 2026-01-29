package com.java.fundamentals;

import java.util.Scanner;

public class StudentData {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Roll Number: ");
        int rollNumber = sc.nextInt();

        System.out.print("Enter Student Initial: ");
        char studentInitial = sc.next().charAt(0);

        System.out.print("Enter Age: ");
        byte age = sc.nextByte();

        System.out.print("Enter Section: ");
        char section = sc.next().charAt(0);

        System.out.print("Enter Total Marks: ");
        int totalMarks = sc.nextInt();

        System.out.print("Enter Average Marks: ");
        float averageMarks = sc.nextFloat();

        System.out.print("Enter Year of Joining: ");
        short yearOfJoining = sc.nextShort();

        System.out.print("Enter Mobile Number: ");
        long mobileNumber = sc.nextLong();

        System.out.print("Passed (true/false): ");
        boolean isPassed = sc.nextBoolean();

        System.out.println("\n--- Student Details ---");
        System.out.println("Roll Number: " + rollNumber);
        System.out.println("Student Initial: " + studentInitial);
        System.out.println("Age: " + age);
        System.out.println("Section: " + section);
        System.out.println("Total Marks: " + totalMarks);
        System.out.println("Average Marks: " + averageMarks);
        System.out.println("Year of Joining: " + yearOfJoining);
        System.out.println("Mobile Number: " + mobileNumber);
        System.out.println("Passed: " + isPassed);

        sc.close();
    }
}
