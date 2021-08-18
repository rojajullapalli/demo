package com.roja.helloworld;

public class InsStat {
    int number;//instance variable-->if we want to access instance variable we have create object
    static int number1;//static variable-->static can be directly accessable without object creation
    public static void main(String[] args) {
        InsStat i1= new InsStat();
        i1.number=5;
        i1.number1=6;
        System.out.println(i1.number);
        System.out.println(i1.number1);
        InsStat i2= new InsStat();
        i2.number=7;
        i2.number1=8;
        System.out.println(i2.number);
        System.out.println(i2.number1);

        System.out.println(i1.number1);

    }
}
