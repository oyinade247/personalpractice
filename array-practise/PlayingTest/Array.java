
import java.util.Arrays;
public class Array{



		/*public static void main(String [] args){
		Array array = new Array();

		int [][]numbers = {{1,3,4,5},{2,3},{5,6,7,8,9}};

		int []combined = array.combinedArray(numbers);

					
			System.out.print(Arrays.toString(combined));


		}*/

	
	public int [] sortedArray(int [] numbers){
		

	for(int count = 0; count < numbers.length; count++){

		for(int counter = 0; counter < numbers.length; counter++){
			if(numbers[count] < numbers[counter]){
				int temp = numbers[count];
				numbers[count] = numbers[counter];
				numbers[counter] = temp;
			}
		}
	}

		return numbers;
   }


	public int  lengthArray(int [] numbers){
		int count = 0;

		for(int number : numbers) count ++;


		return count;

}

	public static int countCombinedArray(int[]... numbers){
		int count = 0;
		for(int []number: numbers)count += number.length;
		return count;

	}


	public int [] combinedArray(int[] ...numbers){

		int combined = countCombinedArray(numbers);
		int [] newArray = new int[combined];
		int index = 0;
		for(int[] number : numbers){
			for(int count = 0; count < number.length; count++){
				newArray[index] = number[count];
				index++;
			}
			}

		return newArray;


	}
	


}