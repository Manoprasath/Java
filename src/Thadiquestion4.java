import java.util.Scanner;

public class Thadiquestion4 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter any number");
		int endvalue = scan.nextInt();
		System.out.println("And your expected result is");
		int x = 97;
		for(int i = 97; i<97 + endvalue; i++ ){
			System.out.printf("%c " , i);
		}
	}

}
