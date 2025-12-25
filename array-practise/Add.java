import java.util.Arrays;
public class Add{
	public static void main(String[] args){

	int [] numbers = {1,2,3,4,5};

	int newNumber = 6;
	
	int [] newArray = new int[numbers.length + 1];

	for(int count = 0; count < numbers.length; count++ ){
		newArray[count] = numbers[count];

	}
		newArray[numbers.length] = newNumber;
		System.out.print(Arrays.toString(newArray));
	
	

	
 }
}