package test;

import java.util.Scanner;

public class PrimeNumberChk {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int age;
		boolean prime = true;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the Age ");
		age = scanner.nextInt();
		for (int i = 2; i <= age/2; i++) {
			if (age % i == 0) {
				prime = false;
				break;
			}
		}
		if (prime) {
			System.out.println("prime");
		} else {
			System.out.println("not prime");
		}
	}
}
