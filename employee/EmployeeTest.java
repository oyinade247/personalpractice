public class EmployeeTest{

	public static void main(String [] args){

		Date hireDate = new Date(12, 05, 2025);
		Date birthDate = new Date(5, 05, 1999);
		Employee employ = new Employee("Oyin", "ade", hireDate, birthDate);
		System.out.print(employ);
	}
	

}