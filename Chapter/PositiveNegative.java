import java.util.Scanner;
	public class NegativePositive{
		public static void main(String[] args){

		Scanner collector = new Scanner(System.in);
		
		 int positive = 0;
		 int  negative = 0;
		 int sum = 0;
		 int result = 0;
		 int number;
		int total = 0;
		 		 

		do{
			 System.out.print("Enter a number(enter 0 to stop):");
			  number = collector.nextInt();
			  total += number;
			  if(number > 0 ){
			   positive++;
			  
			  }
			   else if(number < 0){
			    negative++;
			   
			   }

			sum = positive + negative; 						 
		
		   
		}while(number != 0);
		result = total / sum;
		System.out.println(sum);
		
		
			

	}

}