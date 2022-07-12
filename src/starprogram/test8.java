package starprogram;
import java.util.Scanner;
public class test8 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("enter number ");
		int num = scanner.nextInt();
		for (int i=1; i<= num ; i++)
        {
            for (int j=1; j<= i ;j++){
                if( j==i) {
                    System.out.print(" * ");
                }
                else {
                    System.out.print(" ");
                }
            }
            System.out.println("");
        
}
}
}