import java.util.Arrays;
public class Reverse{
	public static void main(String[] args){

	String [] names = {"divine","victor","john"};
	
	int index = 0;
	
	String first = names[index];

	String reversed = "";


		for(int count = first.length() - 1 ; count >= 0; count--){
			reversed = reversed + first.charAt(count);

		}
			names[index] = reversed;


		System.out.print(Arrays.toString(names));
			


}

}

