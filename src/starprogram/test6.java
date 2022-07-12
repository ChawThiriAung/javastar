package starprogram;
import java.util.Scanner;
public class test6 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("enter number");
		int num = scanner.nextInt();
		System.out.println("star is");
		for (int n = 0; n <= num-1; n++) {
			
			for (int m = 0; m <= n; m++) {
				
				System.out.print("*" +" ");
			}
	
			System.out.println("");
}
		for (int i= num-1; i>= 0 ; i--)
        {
            for (int j=0; j<=i-1; j++)
            {
                System.out.print("*" +" ");
            }
            System.out.println("");
        }
}
}
