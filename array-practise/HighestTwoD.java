import java.util.Arrays;
public class HighestTwoD{
	public static void main(String[] args){

	int [][] number = {
		{1, 2, 3},
		{4, 5, 6},
		{7, 8, 9}
	};

	int [] highest = new int[number.length]; 
	int []  index1 = new int[number.length]; 

	for(int count = 0; count < number.length; count++){
		int max = number[count][0];
		int index = 0;

		for(int counter = 0; counter < number[count].length; counter++){
			if(number[count][counter] > max){
				max = number[count][counter];
				index = counter;
				
			}

			highest[count] = max;
			index1[count] = index ;
	}
	}
		System.out.print(Arrays.toString(highest));
		System.out.print(Arrays.toString(index1));	


}
}