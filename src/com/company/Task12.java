package com.company;

public class Task12 {

    public static void main(String args[])
        {
            int number = 100;
            isNumberEqualZero(number);
        }
        public static void isNumberEqualZero (int number)
        {
            if (number < 0) {
                System.out.println("Number < 0");
            } else if (number > 0) {
                System.out.println("Number > 0");
            } else { System.out.println("Number = 0");
                }
        }
}
