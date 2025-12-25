import java.util.Arrays;
import java.util.Scanner;

public class InputTwoD{
	public static void main(String[] args){

	int [][] number = new int[3][4];
	
	Scanner input = new Scanner(System.in);

	for(int count = 0; count < number.length; count++){
		for(int counter = 0; counter < number[count].length; counter++){

			System.out.print("Enter any number");
			number[count][counter] = input.nextInt();
		
			
		}
		
	}
		System.out.print(Arrays.deepToString(number));


}

}