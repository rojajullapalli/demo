package com.roja.helloworld;

public class Methodexample {
    public void instanceexample(){
    //    a=7;
        System.out.println("instance method example");
    }
    public static void saticexample(){
        System.out.println("static method example");
    }
    public static void main(String[] args) {
        Methodexample m1=new Methodexample();
        m1.instanceexample();
        saticexample();
    }
}
