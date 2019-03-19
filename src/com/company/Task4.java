package com.company;

public class Task4 {

    public static void main(String[] args) {
        int[] ArrForSum = {100, 1, 2, 3, 4, 5, 6, 7, 8, 100};
        int Sum = 0;
        for (int i = 1; i < ArrForSum.length - 1; i++)
        {
            Sum += ArrForSum[i];
        }
        System.out.println(Sum);
    }
}

