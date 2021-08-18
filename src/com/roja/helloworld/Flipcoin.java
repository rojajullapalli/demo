package com.roja.helloworld;

public class Flipcoin {
    public static void main(String[] args) {
        double flip = Math.floor(Math.random() * 10) %2;
        if(flip >=0) {
            if (flip == 1)
                System.out.println("head");
            else
                System.out.println("tail");
        }
    }
}
