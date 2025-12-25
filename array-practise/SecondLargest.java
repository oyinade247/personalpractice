import java.util.Arrays;
public class SecondLargest{
	public static void main(String [] args){

	/*int [] numbers = {10, 20, 5, 8, 20};
	 
	int firstHighest = Integer.MIN_VALUE;
	int secondHighest = Integer.MIN_VALUE;

	for(int count = 0; count < numbers.length; count++){
		if(numbers[count] > firstHighest){
			secondHighest = firstHighest;
			firstHighest = numbers[count];
		}	
		else if(numbers[count] > secondHighest && numbers[count] != firstHighest){
			secondHighest = numbers[count];
		}
		
	}
	System.out.print(secondHighest);*/

double [] myList = {1,2,3,4,5};

 for (int i = myList.length - 1; i > 0; i--) {
  int j = (int)(Math.random()* (i + 1));
 
 double temp = myList[i];
  myList[i] = myList[j];
  myList[j] = temp;
 }

System.out.print(Arrays.toString(myList));

		


}

}
