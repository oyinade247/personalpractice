public class HighestDivisible{
	public static void main(String [] args){

	int [] numbers = {3, 10, 18, 5};

	int max = numbers[0];
	
	for(int count = 0; count < numbers.length; count++){
		if (numbers[count] > max && numbers[count] % 3 == 0){
			max = numbers[count];
		}
		
	}
	System.out.print(max);
}
}