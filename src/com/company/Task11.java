package com.company;

public class Task11
{
    public static void main(String args[])
    {
        int n = 6;
        printFigure(n);
    }

    public static void printFigure(int n)
    {
        for (int i = 1; i <= n; i++)
        {
            for (int j = i; j < n; j++)
                System.out.print(" ");
            for (int k = 1; k<(i*2); k++)
                System.out.print("*");
            System.out.print("\n");
/*            for (int j = 0; j <= i; ++j)
            {
                System.out.print("* ");
            }
            System.out.println();*/
        }
    }

}