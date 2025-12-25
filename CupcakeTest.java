import java.util.Scanner;

public class SmallestNumber{
	public static void main(String[] args){
	Scanner input = new Scanner(System.in);

	System.out.print("how many input do you want to enter?");
	int number = input.nextInt(); 

	int [] number1 = new int[number];

	int largest = number1[0];
	for(int count =  0; count < number; count++){
		System.out.print("Enter a number: ");
		number1[count] = input.nextInt();

		if(largest < number1[count]){
		largest = number1[count];
		}

	}
	System.out.print(largest);

	

		
		
						
				

	}
}
