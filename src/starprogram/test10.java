package starprogram;
import java.util.Scanner;
public class test10 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("enter number ");
		int num = scanner.nextInt();
		for (int i=1; i<=(num * 2 -1); i++)
        {
            if( i == num)
            {
             
                for (int j=1; j<=(num * 2 -1); j++)
                {
                    System.out.print("*");
                }
            }
            else
            {
             
                for(int k=1; k<= num-1; k++)
                {
                    System.out.print(" ");
                }
                System.out.print("*");
            }
            System.out.println();
        
}
}
}