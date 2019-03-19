package com.company;

public class Task6 {
    public static void main(String[] args)
    {
        System.out.println(getEvenDigitSum(2222));
    }

    public static int getEvenDigitSum(int number) {
        if (number < 0) {
            return -1;
        }
        int anotherNumber = 0;
        while (number > 0) {
            if (((number%10)%2) == 0) {
                anotherNumber += number%10;
            }
            number /= 10;
        }
        return anotherNumber;
    }
}
