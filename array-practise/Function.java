import java.util.Arrays;
public class Function{

	public static void main(String...args){

	int [] num = {2, 4, 6, 8};
		System.out.println(sumElement(num));

	int [] numb = {10, 5, 25, 8, 15};

		System.out.println( max(numb));
	
	int [] numb1 = {10, 5, 25, 8, 15};

		System.out.println( min(numb1));
	
	int [] numb2 = {10, 5, 25, 8, 15};
		System.out.println(countOdd(numb2));


	int [] numb3 = {10, 5, 25, 8, 15};
		System.out.println(countEven(numb3));


	int [] numbers = {1, 2, 3, 4, 5};
		System.out.print(Arrays.toString(swap(numbers)));

	
		int [] number1 = {1, 2, 3, 4, 5};
		System.out.print( average(number1));
	}


	public static int sumElement(int [] numbers){

		int sum = 0;
		for(int count = 0 ; count < numbers.length; count++){
			sum += numbers[count];
		}
		return sum;
	}


	public static int max(int [] numbers){
		int highest = 0;
		for(int count = 0 ; count < numbers.length; count++){
			if(numbers[count] > highest){
				highest = numbers[count];
			}

		}
		return highest;
	

	}


	public static int min(int [] numbers){
		int lowest = numbers [0];
		for(int count = 0 ; count < numbers.length; count++){
			if(numbers[count] < lowest){
				lowest = numbers[count];
			}

		}
		return lowest;
	

	}

	
	public static int countEven(int [] numbers){
		int counter = 0;
		for(int count = 0 ; count < numbers.length; count++){
			if(numbers[count] % 2 == 0){
				counter++;
			}

		}
		return counter;
	

	}



	public static int countOdd(int [] numbers){
		int counter1 = 0;
		for(int count = 0 ; count < numbers.length; count++){
			if(numbers[count] % 2 != 0){
				counter1++;
			}

		}
		return counter1;
	

	}




	public static int[] swap(int [] numbers){
	
		for(int count = 0; count < numbers.length; count ++){
			for(int counter = 0; counter < numbers.length -1 - count; counter++){

				if(numbers[counter] < numbers[counter + 1]){
				int temp = numbers[count];
				numbers[count] = numbers [counter + 1];
				numbers[counter + 1]  = temp;
				
			}

		}
		}

		return numbers;

	}



		public static int average(int [] numbers){
		int average = 0;
		for(int count = 0 ; count < numbers.length; count++){
			average = sumElement(numbers) / numbers.length;
		}
		return average;
	

	}

	
	



	




	




}