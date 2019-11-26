import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Sort {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter any number");
		int count = in.nextInt();

		System.out.println("Count " + count);

		int[] input = new int[count];

		for (int i = 0; i < input.length; i++) {
			input[i] = in.nextInt();
		}
		in.close();

		System.out.println("Before sorting");
		for (int i = 0; i < input.length; i++) {
			System.out.println(input[i]);
		}
		
		int temp = 0;
		
		for (int i = 0; i < input.length; i++) {
			for (int j = i + 1; j < input.length; j++) {
				
				if (input[i] > input[j]) {
					temp = input[i];
					input[i] = input[j];
					input[j] = temp;
				}
				
			}
		}
		

		System.out.println("After sorting");
		for (int i = 0; i < input.length; i++) {
			System.out.println(input[i]);
		}

	}
}