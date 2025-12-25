public class TimeTest{

	public static void main(String [] args){
		Time1 time = new Time1();

		display("Before we create the time ", time);
		System.out.println();

		time.setTime(12 , 3, 4);
		display("After we create the time ", time);

		try{
		   time.setTime(22, 56, 78);
		}
		catch(IllegalArgumentException e){

			System.out.printf("%s %n", e.getMessage());
		}


		display("After we create the time ", time);

		
	}



private static void display(String header, Time1 t){
	System.out.printf("%s%n Current time: %s%n  Standardtime : %s%n   " ,header, t.toUniversalTime(), t.toString());

}



}