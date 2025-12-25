import java.util.Arrays;

public class SortingOne{
	public static void main(String[] args){
		
	int [] number = {1,3,4,5,6};

	for(int count = 0; count < number.length; count++){
		for(int counter = 0; counter < number.length - 1 - count; counter++){
			if(number[counter] > number[counter + 1]){
			int temp = number[count];
			number[count] = number[counter + 1];
			number[counter + 1] = temp;
			
			}
		}
	}
		System.out.print(Arrays.toString(number));
		
}
}