import java.util.Scanner;
public class SmallestFactor{
	public static void main(String[] args){
	Scanner input = new Scanner(System.in);
	System.out.print("Enter a number:");
	 int number1 = input.nextInt();
	
	  String numberCount = "";
	  int divisor = 2;

	  while(number1 > 0){
		if(number1 % divisor == 0){
	  		int dividedNumber = number1 / divisor;
			numberCount += divisor;
		}else{
			divisor++;
		}
		System.out.print(divisor);
	  }
	
	}
}