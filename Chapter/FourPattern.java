public class FourPattern{
	public static void main(String [] args){

	for(int count = 1; count <= 7; count++){
		for(int counter = 1; counter <= count; counter++){
			System.out.print("4");
		}
		for(int counter2 = count; counter2 <= 7; counter2++){
			System.out.print(" ");
		}
		for(int counter3 = count ; counter3 <= 7 ; counter3++){
			System.out.print("3");
		}
		for(int counter4 = 7; counter4 >= 1; counter4--){
			System.out.print(" ");

		}
		for(int counter5 = 1; counter5 <= count; counter5++){
			System.out.print("5");

		}

		for(int counter6 = 1; counter6 < count; counter6++){
			System.out.print(" ");

		}


		for(int counter7 = 7; counter7 >= 1; counter7--){
			System.out.print(" ");

		}

		for(int counter8 = count; counter8 <= 7; counter8++){
			System.out.print("1");

		}
		//for (int j = 7; j >= count; j--){

		//System.out.print(j);
			
	//}

		System.out.println(" ");
	}






	}

}