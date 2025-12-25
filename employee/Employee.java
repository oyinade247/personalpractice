public class Employee{

	private String firstName;
	private String secondName;
	private Date birthDate;
	private Date hireDate;
	
public Employee(String firstName, String secondName, Date birthDate, Date hireDate){
	this.firstName = firstName;
	this.secondName = secondName;
	this.birthDate = birthDate;
	this.hireDate = hireDate;

}



public String toString(){
	return String.format(" %s %s birthdate : %s hiredate : %s ",firstName,secondName, birthDate, hireDate );

}








}