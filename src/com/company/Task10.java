package com.company;

public class Task10 {
    public static void main(String args[]) {
        for (int i = 0; i < 5; i++) {
             if (i < 1 | i > 3) {
                 System.out.print("**********");
            } else {
                 System.out.print("*        *");
             }
            System.out.println();
        }
    }
}