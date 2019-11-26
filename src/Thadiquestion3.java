import java.util.Scanner;

public class Thadiquestion3 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the first value");
		int a = scan.nextInt();
		System.out.println("Enter the second value");
		int b = scan.nextInt();
		int result = 0;
		System.out.println("And the result is");
		System.out.print(a + " " + b + " ");
		for(int i = 0; i<10; i++){
			result = a + b;
			a = b;
			b = result;
			System.out.print(result+ " ");
		}
		
	}

}
