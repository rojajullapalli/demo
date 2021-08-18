package com.roja.helloworld;

import java.util.Scanner;

public class leapyear {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the year to find it is leap or not");
        int year=sc.nextInt();
        checkYear(year)? printf("Leap Year"):
                printf("Not a Leap Year");

        if ((year%100)==0)
            System.out.println("not a leap year");
        if((year%4)==0)
            System.out.println("entered year is leap year");
        if ((year%400)==0)
            System.out.println("entered year is leap year");



    }
}
