package starprogram;
import java.util.Scanner;
public class test {
	
	public static void main (String[] args)
	{
	Scanner scanner = new Scanner(System.in);
	
	System.out.println("enter number ");
	
	int num = scanner.nextInt();
	System.out.println("star is");
	
	for (int m = 1; m <= num; m++)
	{
	for (int n=num; n>m; n--)
	{
	System.out.print(" ");
	}
	for (int p=1; p<=(m - 1); p++)
	{
	System.out.print("*");
	}
	System.out.println();
	}
}
}