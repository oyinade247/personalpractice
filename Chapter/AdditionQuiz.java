import java.util.Scanner;
	public class AdditionQuiz{
		public static void main(String[] args){

		Scanner collector = new Scanner(System.in);

	    int numberOfQuestion = 10;
	    int countCorrect = 0;
	    int wrongCount = 0;

	    long startTime = System.currentTimeMillis();
	    int count = 0;

	     while(count <= numberOfQuestion){
		int firstNumber = (int)(Math.random() *15);
		int secondNumber = (int)(Math.random() *15);

		int temp = firstNumber;
		firstNumber = secondNumber;
		secondNumber = temp;

		System.out.println("What is " + firstNumber + " " + "+" + " " + secondNumber + "?");

		int answer = collector.nextInt();

		if(firstNumber + secondNumber == answer){
			System.out.println("You are correct");
			countCorrect++;
		}
		else{
			System.out.printf("You are wrong,The right answer is %n %d %s %d %d", firstNumber, "+", secondNumber, (firstNumber + secondNumber));
			wrongCount++;
		 
		}
		 
		count++;
		


	     }

		System.out.print("The correct count is " + " " + countCorrect);
		long endTime = System.currentTimeMillis();
		long total = startTime - endTime;
		System.out.print("The total Test time spent is" + " " + total);



	}

}