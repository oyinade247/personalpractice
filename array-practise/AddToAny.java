import java.util.Arrays;
public class AddToAny{
	public static void main(String[] args){

	int [] numbers = {1,2,3,4,5};
		
	int newNumber = 8;
	
	int [] newArray = new int[numbers.length + 1];

	int loop = 3;

		for(int count = 0; count < loop; count++){
			newArray[count] = numbers[count];
		}
			newArray[loop] = newNumber;
			for(int counter = loop + 1; counter <= numbers.length ; counter++){
				newArray[counter] = numbers[counter - 1];
			}

			System.out.print(Arrays.toString(newArray));


	}
}
