package starprogram;

import java.util.Scanner;

public class test3 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("enter number ");
		int num = scanner.nextInt();
		System.out.println("star is");
		for (int n = 1; n <= num; n++) {
			for (int m = 1; m <= num; m++) {
				System.out.print(" ");
			}
			for (int p = num; p > n - 1; p--) {
				System.out.print(" * ");
			}
			System.out.println();
		}
	}
}
