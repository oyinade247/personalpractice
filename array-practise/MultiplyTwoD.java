import java.util.Arrays;
public class MultiplyTwoD{
	public static void main(String[] args){

	int [][] number = {
		{1, 2, 3},
		{4, 5, 6},
		{7, 8, 9}
	};


	int [] newArray = new int [number.length];

	for(int count = 0; count < number.length; count++){
		int multiply = 1;
		for(int counter = 0; counter < number[count].length; counter++){
		 multiply *= number[count][counter];
		}
			System.out.print(multiply);
		newArray[count] = multiply;
	}
			System.out.print(Arrays.toString(newArray));	



 }
}