import java.util.Scanner;
public class quiz{
	public static void main(String [] args){
		Scanner input = new Scanner(System.in);

		String [] questions = {"Who is the president of Nigeria?: "," What is the hardest natural substance on Earth? ", "How many legs do spiders have?"," What is a group of lions called? " };
	

		String [][] options = {
					{"1. obasanjo","2. victor"," 3.Tinubu"},
					{"1.gold", "2.silver","3.diamond",},
					{"1. 10", "2. 15", "3. 8"},
					{"1. fleet", "2. pride","3. herd"}
					};
		int [] answers  = {3, 3, 3, 2};
		int counter = 0;
		for(int count = 0 ; count < questions.length; count++){
			System.out.println(questions[count]);

			for(String option : options[count]){
				System.out.println(option);
			
			}
			System.out.print("Enter your answer?:");
				int choice = input.nextInt();
				if(choice == answers[count] ){
					System.out.println("You answered correctly");
						counter++;}	
				else{
					System.out.println("You answered wrongly");

				}
				
			
		}
			System.out.print("you scored "+ counter + "/" + questions.length);
			

}

}