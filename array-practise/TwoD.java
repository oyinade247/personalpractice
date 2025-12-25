import java.util.Arrays;
public class TwoD{
	public static void main(String[] args){

	int [][] number = {
		{1, 2, 3},
		{4, 5, 6},
		{7, 8, 9}
	};

	for(int count = 0; count < number.length; count++){
		System.out.println("-------------------");

		for(int counter = 0 ; counter < number[count].length; counter++){
			System.out.print(number[count][counter] + " |");
			

			
		}
	

		System.out.println();
	}



}
}