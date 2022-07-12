package starprogram;
import java.util.Scanner;
public class Starlesson1 {
	
	public static void main(String arg[])
	{
		Scanner scanner = new Scanner (System.in);
		System.out.println("Please enter the number.");
		int num =scanner.nextInt();
		System.out.println("star is");
		for (int i= 0; i<= num-1 ; i++)
        {
            for (int j=num-1; j>i; j--)
            {
                 System.out.print(" ");
            }
            for (int k=0; k<=i; k++)
            {
                 System.out.print("*" + " ");
            }
            System.out.println();
        }
		
		
	}
	}
	


