import java.util.Arrays;
public class SumTwoD{
	public static void main(String[] args){

	int [][] number = {
		{1, 2, 3},
		{4, 5, 6},
		{7, 8, 9}
	};

	
	int [] newArray = new int[number.length];

	for(int count = 0; count < number.length; count++){
		int sum = 0;
		for(int counter = 0; counter < number[count].length; counter++){
			 sum += number[count][counter] ;
		}
		System.out.print(sum + " ");
		newArray[count] = sum;
	}

		
		System.out.print(Arrays.toString(newArray));	

}
}