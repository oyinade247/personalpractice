import java.util.Arrays;
public class FactorNumber{

public static void main(String [] args){
	int number = 10;
	 factorOfNumbers(number);
	System.out.println();
	System.out.println(sumOfFactors(number));
	
	System.out.println(countOfFactors(number));

	System.out.println(perfectNumber(number));
	System.out.println(primeNumber(number));
	//primeFactors(number);
	System.out.println(highestPrimeFactors(number));

}



public static void factorOfNumbers(int number){
	for(int count = 1; count <= number ; count ++){
		if(number % count == 0){
			System.out.print(count + " ");

		}


	}

}

public static int sumOfFactors(int number){
	int sum = 0;
	for(int count = 1; count < number; count ++){
		if(number % count == 0){
		sum += count;
				
		}

	}
return sum ;

}


public static int countOfFactors(int number){
	int counter = 0;
	for(int count = 1; count < number; count ++){
		if(number % count == 0){
		counter++;
				
		}

	}
return counter ;

}

public static boolean perfectNumber(int number){
	int sum = 0;
	for (int count =  1 ; count < number; count ++){
		if(number % count == 0){
			sum += count;
		
		}

	}
		if(sum == number){
			return true;
		}
		return false;

}

public static boolean primeNumber(int number){
	int counter = 0;

	for(int count = 1; count <= number; count++){
		if(number % count == 0){
			counter ++;
		}

	}

	if(counter == 2){
		return true;

	}
	return false;

}

public static void primeFactors(int number){
	int divisor = 2;
	while(number > 1){
		if(number % divisor == 0){
		number = number / divisor ;
	
		}
		else{
		divisor++;
		}
		System.out.print(divisor);

	}
	
	
}

public static int highestPrimeFactors(int number){
	int divisor = 2;
	String store = "";
	while(number > 1){
		if(number % divisor == 0){
		number = number / divisor ;
		store += divisor;
		
		}
		else{
		divisor++;
		}
		//System.out.print(store);
	}

	int len = store.length();
	int [] numbers = new int [len]; 
	int  convertedNumber = Integer.parseInt(store);
	System.out.print(len);

	int count = 0;
	while(convertedNumber > 0){
		int remainder = convertedNumber % 10;
		numbers[count] = remainder;
		convertedNumber /= 10;
		
	}	
		//System.out.print(Arrays.toString(numbers));

	int highest = numbers[0];
	for(int counter = 0; counter < numbers.length; counter++){
		if(numbers[counter] > highest){
			highest = numbers[counter];
		
		}

	}


	return highest;



}




















}