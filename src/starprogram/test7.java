package starprogram;
import java.util.Scanner;
public class test7 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("enter number");
		int num = scanner.nextInt();
		 for (int n= 1; n<= num ; n++)
	        {
	            for (int j=n; j < num ;j++)            {
	                System.out.print(" ");
	            }
	            for (int k=1; k<=n;k++)
	            {
	                System.out.print("*");
	            }
	            System.out.println("");
	        }
	        for (int i=num; i>=1; i--)
	        {
	            for(int j=i; j<=num;j++)
	            {
	                System.out.print(" ");
	            }
	            for(int k=1; k<i ;k++) 
	            {
	                System.out.print("*");
	            }
	            System.out.println("");

	        }
}
}
