import java.util.Scanner;

public class QuestionOne {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.println("enter any number");

		int input = scan.nextInt();
		
		System.out.println("output");
		int count = 1;
		for (int i = 1; i <= input; i++) {

			for (int j = 1; j <= i; j++) {
				
				System.out.print(count+ " ");
				count++;

			}
			
			System.out.println();

		}

	}

}
