import java.util.Scanner;

public class Thadiquestion5 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("enter the count");
		int count = scan.nextInt();

		int[] intArray = new int[count];
		int length = intArray.length;
		System.out.println("enter your values one by one" + length);

		int i = 0;

		while (i < length) {
			intArray[i] = scan.nextInt();
			i++;
		}
		scan.close();
		
		System.out.println(i);
		//i = i-1;
		while (i > 0) {
			i--;
			System.out.println(intArray[i]);
		}

	}

}
