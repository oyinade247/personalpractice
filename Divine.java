/*public class Divine{
	public static void main(String[] args){
	
	int number = 120;

	String dividedNumber = "";

	while(number > 0){

	 	int remainder = number % 10;
		
		if (remainder != 0) {
	 		dividedNumber += remainder;
		}
		number /= 10;
	
	}
		System.out.print(dividedNumber);*/



public class Divine{

	public static void main(String[] args){

	for(int count = 6; count >= 1; count--){
		for( int counter = 1; counter <= count-1 ; counter++){
			System.out.print("1");
		}

		for(int counter2 = 1; counter2 <= 6; counter2++){
			System.out.print("");
		}
		

		//for(int counter3 = 1; counter3 <=   ; counter3++ ){
		//	System.out.print("3");
		//}
		System.out.println();
	}



	

	}
}