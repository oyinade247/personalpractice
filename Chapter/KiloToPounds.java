import java.util.Scanner;
	public class AdditionQuiz{
		public static void main(String[] args){

		Scanner collector = new Scanner(System.in);
		
		

		int count = 1;
		
			System.out.printf("%5s %5s","Kilogaram", "pounds");
	System.out.print("      "  );
		
		double multiply = 2.2;			
		for(count = 1; count <= 5; count++){
			System.out.println(" ");
			System.out.print("Enter a number: ");
		 	System.out.print(count + "    ");
			for(int counter = 1; counter <= 1; counter++){
			  System.out.printf(" %.2f    %n", count * multiply);
			}
			System.out.println();
			
		}
		



	}
}