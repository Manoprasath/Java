import java.util.Scanner;

public class Thadiquestion1 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the number");
		int number = scan.nextInt();
		System.out.println("here's the result of yours");
		
		for(int i = 1; i<=number; i++){
			int result = i*i;
			System.out.print(result+" ");
		}

	}

}
