public class School{

	private String name;
	private int numberOfStudents;
	private String address;

public School(String name, int numberOfStudents, String address){

	this.name = name;
	this.numberOfStudents = numberOfStudents;
	this.address = address;

}
	public void announceSchool(){
		System.out.println("The name of the school is " + name + "the school address is " + address);
	}
	

	public double getAverage(int numberOfClasses){
		return numberOfStudents / numberOfClasses;
	}
	

	
}
