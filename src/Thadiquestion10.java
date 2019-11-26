import java.util.Scanner;

public class Thadiquestion10 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("enter the range");
		int input = scan.nextInt();
		int nos = 0;
		for (int i = 1; i != 0; ) {

			for (int j = 1; j <= i; j++) {
				System.out.print(i + " ");
			}

			System.out.println();
			if(i < input && nos == 0){
				i++;
			}
			else{
				nos = 1;
				i--;
			}
		}

	}

}
