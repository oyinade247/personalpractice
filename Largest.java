import java.util.Scanner; 
public class Largest{
	public static void main(String [] args){
	
	Scanner collector = new Scanner(System.in);

	System.out.print("Enter a number:");
	int firstNumber = collector.nextInt();

	//int max = firstNumber;

	int count = 1;
	int big = 0;

	while(count <= 3){
		System.out.print("Enter a number:");
		int secondNumber = collector.nextInt();
		count++;

		big = Stream.max(firstNumber, secondNumber);
		//if(max < secondNumber){
			//max = secondNumber;

		//}
				
	}
		System.out.print(big);



	}
	
}	