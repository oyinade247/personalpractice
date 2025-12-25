import java.util.Arrays;
import java.util.Scanner;

public class InputTwoD{
	public static void main(String[] args){

	int [][] number = new int[3][4];
	
	Scanner input = new Scanner(System.in);

	int [] highest = new int[number.length];

	for(int count = 0; count < number.length; count++){
		int max = number[count][0];

		for(int counter = 0; counter < number[count].length; counter++){

			System.out.print("Enter any number");
			number[count][counter] = input.nextInt();
			if(number[count][counter] > max){
				max = number[count][counter];
			}
			
		}
		highest[count] = max;
		
	}
		System.out.println(Arrays.toString(highest));
		
		System.out.print(Arrays.deepToString(number));


}

}