package com.java.fundamentals;

import java.util.Scanner;

public class TakeInput {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        byte age;
        System.out.println("Enter Your Age : ");
        age = sc.nextByte();
        int salary;
        System.out.println("Enter Your Salary : ");
        salary = sc.nextInt();

        System.out.println("Age : " + age);
        System.out.println("Salary : " + salary);
        sc.close();
    }
}
