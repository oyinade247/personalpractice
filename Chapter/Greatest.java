import java.util.Scanner;
public class Greatest{
	public static void main(String[] args){
	Scanner input = new Scanner(System.in);
	System.out.print("Enter a number:");
	 int number1 = input.nextInt();
	
	System.out.print("Enter a number:");
	 int number2 = input.nextInt();

		
	 int greatest = 1;
	 int gcd = 2;
	 //int number1 = 0;
	 //int number2 = 0;
	 while(gcd <= number1 && gcd <= number2){
	 	
		if(number1 % gcd == 0 && number2 % gcd == 0){
		  	greatest = gcd;
			gcd++;
		}

	}
		System.out.print(greatest);

	}
}
