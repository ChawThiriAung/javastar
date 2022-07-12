package starprogram;
import java.util.Scanner;
public class test4 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("enter number ");
		int num = scanner.nextInt();
		System.out.println("star is");
		for (int n = 0; n <= num-1; n++) {
			for (int m = 0; m <= n; m++) {
				System.out.print(" ");
			}
			for (int p = 0; p <= num- n - 1; p++) {
				System.out.print(" * ");
			}
			System.out.println();
}
}
}
