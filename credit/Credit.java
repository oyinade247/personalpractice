import java.util.Scanner;
import java.util.Arrays;

public class Credit{
	public static void main(String [] args){
	Scanner input = new Scanner(System.in);

	System.out.print("Enter 16 digits: ");
	long number = input.nextLong();
	
	int num = String.valueOf(number).length();
	int[] add = doubleSecondDigits(number);
	int sumEven = sum(add);
	int odd= addOdd(number);
	int sumBoth = addOddAndEven(sumEven,odd) ;
	String verify = checkCard(number);
	String valid = isValid(sumBoth );


	//System.out.println(Arrays.toString(add));
	//System.out.println(sumEven);
	//System.out.println(odd);
	//System.out.println( sumBoth);
	//System.out.println(verify);






	System.out.println("****************************");
System.out.println("Credit card type: "  + valid);
System.out.println("Credit Card Number: " + number);
System.out.println("Credit Card Digit Length: " + num);
System.out.println("Credit Card Validity Status: " + verify);
System.out.println("****************************");











	
	}



public static int[] doubleSecondDigits(long number){

	int [] array = new int [String.valueOf(number).length()];
	
	for(int count = array.length -1; count >=0; count--){
		array[count] = (int)(number % 10); 
		number /= 10;
		
	}
	for(int counter = array.length - 2; counter >=0; counter -=2){
		int doubleSecondDigits = array[counter] * 2; 
		if  (doubleSecondDigits > 9){
			doubleSecondDigits -= 9;
		}


		array[counter] = doubleSecondDigits;
	}
	return array;
		
	


}


public static int sum(int [] add){
	int sum = 0;
		
	for(int count = 0; count < add.length; count++){
		sum += add[count];
	}
	return sum;


}


public static int addOdd(long number){

	int [] array = new int [String.valueOf(number).length()];
	int sum = 0;
	for(int count = array.length -1 ; count >=0; count--){
		array[count] = (int)(number % 10);
		number /= 10;	
	}

	for(int counter =array.length -1; counter >=0; counter -=2){
		sum += array[counter];
	}
	return sum;

}


public static int addOddAndEven(int sumEven , int sumOdd){
	return sumEven + sumOdd;
}

public static String isValid(int sumBoth){
	if (sumBoth % 10 == 0){
		return "valid";
	}
	return "invalid";
}

public static String checkCard(long number){
	long firstDigit = number;
	long firstTwoDigit = number;
	while(firstDigit >= 10){
		firstDigit /= 10;
	}


	while(firstTwoDigit >= 100){
		firstTwoDigit /= 10;
	}

	if(firstDigit == 4){
		return "Visa card";
	}
	else if(firstDigit == 5 ){
		return "Master Card";

	}
	else if(firstTwoDigit == 37){
		return "American express card";

	}
	else if(firstDigit == 6){
		return "Discover card";

	}
	else{
		return "invalid";
	}





}



























}