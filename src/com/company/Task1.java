package com.company;

public class Task1 {

	public static void main(String[] args) {
		int x = 10;
		while (x < 21) {
			System.out.println(x);
			x++;
		}

		System.out.println("***");

		int y = 10;

		do {
			System.out.println(y);
			y++;
		} while (y <= 20);

		System.out.println("***");

		for(int i = 10; i < 21; i++){
			System.out.println(i);
		}
	}
}