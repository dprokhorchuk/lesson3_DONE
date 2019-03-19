package com.company;

import java.math.BigInteger;

public class Task7 {
    public static void main(String[] args)
    {
        System.out.println(getGreatestCommonDivisor(1500,2510000));
    }

    public static int getGreatestCommonDivisor (int a, int b) {
            if (a < 10 | b < 10) {
                return -1;
            }
        BigInteger b1 = BigInteger.valueOf(a);
        BigInteger b2 = BigInteger.valueOf(b);
        BigInteger gcd = b1.gcd(b2);
        return gcd.intValue();
        }
}
