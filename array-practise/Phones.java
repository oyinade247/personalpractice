import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;


public class StudentGrade{	

	public static void main(String [] args){
	System.out.println("==========WELCOME TO LAGBAJA SCHOOL==========");
	Scanner input = new Scanner(System.in);
	System.out.print("Enter the number of student: ");
	int student = input.nextInt();
					
	System.out.print("Enter the number of subject: ");
	int subject = input.nextInt();

	ArrayList<ArrayList<Double>>records = new ArrayList<>();
	ArrayList<String> studentNames = new ArrayList<>();
	mainMenu(records,student, subject, studentNames);

	}




public static void mainMenu(ArrayList<ArrayList<Double>>records, int student , int subject, ArrayList<String> studentNames){
		String prompt = """



		1 => Enter the student name and  subjects score

		2 => View student grade

		3 => summary

			""";
		System.out.print(prompt);
		Scanner input = new Scanner(System.in);
		System.out.print("Enter any options from above: ");
		String choice = input.next();

		switch(choice){
			case "1" : 
				getData(student , subject, records, studentNames);	
				mainMenu(records,student, subject, studentNames);
				break;
				

			case "2":
				System.out.println(studentNames);
				System.out.println(records);


					//System.out.println("1");

				System.out.println("=====================================================================");

				System.out.print("STUDENT NAME    ");

				for (int count = 0; count < subject; count++) {
					System.out.print("SUB" + (count + 1) + "       ");
				}

				System.out.print("TOTAL      AVERAGE	POSITION");
				System.out.println();
				System.out.println("=========================================================================");
				
				for(int index = 0; index < records.size(); index++) {
					ArrayList<Double> studentData = records.get(index);

					System.out.printf("%-16s", studentNames. get(index) );
					
					Double total = getStudentTotal(records.get(index) );
				
					Double average = getAverage(studentData, subject);

					int position = getPosition(studentData, records);

					//int position = getPosition(index, records);
					
					for (int counter = 0; counter < studentData.size(); counter++) {
						System.out.printf("%-14.2f",studentData.get(counter) );
					}

				

					System.out.printf("%-12.2f",total );
					System.out.printf("%-12.2f",average );
					System.out.printf("%-14d",position );
					System.out.println();

				}
				mainMenu(records,student, subject, studentNames);
				break;

				

		case "3" : 
				System.out.print("=========SUBJECT SUMMARY============");
					System.out.println();
					for(int counter1 = 0; counter1 < subject; counter1++){
						System.out.println("SUBJECT " + (counter1 + 1) );
						getHighestScoreSubject(records, studentNames, counter1);
						getLowestScoreSubject(records, studentNames, counter1);
						getTotalScoreSubject(records,   counter1,student);
						getNumberOfPasses(records, studentNames, counter1);
						

						
				}
				break;
				
			

			


		}
	



}






public static ArrayList<ArrayList<Double>> getData(int student ,int subject, ArrayList<ArrayList<Double>> records, ArrayList<String> studentNames){
		Scanner input = new Scanner(System.in);
		double studentScore = 0;

		for(int count = 0; count < student; count++){
			ArrayList<Double> studentData = new ArrayList<>();  
                        
              		System.out.print("Enter students name: ");
		 	String name = input.next();
                        studentNames.add(name);	
	
			for(int counter = 0; counter < subject; counter++ ){ 
				if(studentScore >= 0 && studentScore <= 100 ){
					System.out.print("Enter score for subject " + (counter + 1) + ": ");
					studentScore = input.nextDouble();
			 		studentData.add(studentScore);}
				else {
					System.out.print("invalid");
				}
			}
						
                      	records.add(studentData);
			System.out.println("Student " + name + " added.");
		}
                               
	return records;
}



public static double getStudentTotal(ArrayList<Double>studentData){
	double total = 0;

	for(double data : studentData){
		total += data;


	}

	return total;


}


public static double getAverage(ArrayList<Double>studentData, int subject){

	double studentTotal = getStudentTotal(studentData);	
	double average = studentTotal / subject;
	
return average;


}

public static int getPosition(ArrayList<Double>studentData, ArrayList<ArrayList<Double>>records ){

	double studentTotal = getStudentTotal(studentData);

	int position = 1;

	for(int count = 0; count < records.size(); count++){
		double otherStudent = getStudentTotal(records.get(count));
		if(studentTotal < otherStudent){
			position++;
		}

	}

	return position;

	
	

}


public static void getHighestScoreSubject(ArrayList<ArrayList<Double>>records, ArrayList<String>studentNames, int counter1){
	double highestScore = 0;
	String highestName = "";
		
	for(int count = 0; count < records.size(); count++){
		ArrayList<Double>studentData = records.get(count);
			double score = studentData.get(counter1);

			if(score > highestScore){
				highestScore = score;
				highestName = studentNames.get(count);
			}

	}

	System.out.println("The highest scoring student is :" + highestName+ " scoring " + highestScore);


	
}


public static void getLowestScoreSubject(ArrayList<ArrayList<Double>>records, ArrayList<String>studentNames, int counter1){
	double lowestScore = 100;
	String lowestName = "";
		
	for(int count = 0; count < records.size(); count++){
		ArrayList<Double>studentData = records.get(count);
			double score = studentData.get(counter1);

			if(score < lowestScore){
				lowestScore = score;
				lowestName = studentNames.get(count);
			}

	}

	System.out.println("The lowest scoring student is :" + lowestName+ " scoring " + lowestScore);


	
}


public static void getTotalScoreSubject(ArrayList<ArrayList<Double>>records,int counter1, int student){
	double total = 0;
	double average= 0;

		for(int count = 0; count < records.size(); count++){
		ArrayList<Double>studentData = records.get(count);
		double score = studentData.get(counter1);
		total += score;
		 average = total / student;

		}
		System.out.println("The total score is: " + total);
		System.out.println("The average score is: " + average);


}



public static void getNumberOfPasses(ArrayList<ArrayList<Double>>records, ArrayList<String>studentNames, int counter1){
	double highestScore = 50;
	int countHighest = 0;
		
	for(int count = 0; count < records.size(); count++){
		ArrayList<Double>studentData = records.get(count);
			double score = studentData.get(counter1);
			
			
			if(score > highestScore){
				countHighest++;
			}

	}

	System.out.println("The Number of Passes :" + countHighest);


	
}














}