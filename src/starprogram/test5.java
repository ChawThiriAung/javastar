package starprogram;
import java.util.Scanner;
public class test5 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("enter number");
		int num = scanner.nextInt();
		System.out.println("star is");
		for (int n = 0; n <= num-1; n++) {
			for (int m = num-1; m >= n; m--) {
				System.out.print(" ");
			}
			for (int p = 0; p <=n - 1; p++) {
				System.out.print("*" +" ");
			}
			System.out.println("");
}
		for (int i= 0; i<num-1 ; i++)
        {
            for (int j=-1; j<=i; j++)
            {
                System.out.print(" ");
            }
            for (int k=1; k<=num-2-i; k++)
            {
                System.out.print("*"+" ");
            }
            System.out.println("");
        }
}
}
