package com.company;

public class Task5 {

    public static void main(String[] args)
    {
        System.out.println(min(0,2,1,-3));
    }
    public static int min(int a, int b, int c, int d) {
        return min(min(a, b), min(c, d));
    }
    public static int min(int a, int b) {
        if (a <= b)
            return a;
        else
            return b;
    }
}
