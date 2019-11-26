import java.util.Scanner;

public class Thadiquestion6 {

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
		
		
		int max = intArray[0];
		int min = intArray[0];
		for(i = 1; i<length; i++){
			if(max < intArray[i]){
				max = intArray[i];
			}
			if(min > intArray[i]){
				min = intArray[i];
			}
			
		}
		System.out.println(max);
		System.out.println(min);

	}

}
