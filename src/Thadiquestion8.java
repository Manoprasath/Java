import java.util.Scanner;

public class Thadiquestion8 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("enter the string that you want to reverse");
		String input = scan.next();
		int size = input.length();
		for (int i = size - 1; i >= 0; i--) {
			System.out.println(input.charAt(i));

		}

	}

}
