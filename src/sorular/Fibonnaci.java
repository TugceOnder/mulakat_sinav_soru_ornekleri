package sorular;
import java.util.Scanner;
public class Fibonnaci {
	  public static void main(String[] args) {

		
		        Scanner scanner = new Scanner(System.in);
		        System.out.print("Kaç Fibonacci sayýsý hesaplanacak: ");
		        int n = scanner.nextInt();
		        int a = 0, b = 1;

		        System.out.print("Fibonacci dizisi: ");
		        for (int i = 0; i < n; i++) {
		            System.out.print(a + " ");
		            int next = a + b;
		            a = b;
		            b = next;
		        }
		    }

}
