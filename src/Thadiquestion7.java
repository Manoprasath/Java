import java.util.Scanner;

public class Thadiquestion7 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("enter the string to convert");
		String input = scan.next();
		
		int size = input.length();
		for(int i = 0; i<size; i++){
			char character = input.charAt(i);
			System.out.printf("%I" , character);
			/*int ascii = (int)character;
			System.out.println(ascii);*/
		}

	}

}
