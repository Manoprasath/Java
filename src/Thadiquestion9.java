import java.util.Scanner;

public class Thadiquestion9 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("enter the range");
		int input = scan.nextInt();

		int count = 1;
		for (int i = 0; i < input; i++) {
		
			for (int j = 0; j < i; j++) {
				System.out.print(count + " ");
				count++;
			}
			System.out.println();
		
		}

	}

}
