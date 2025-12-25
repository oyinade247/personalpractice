import java.util.Arrays;
public class ReverseIndex{
	public static void main(String[] args){

	String [] names = {"divine","victor","john"};

	int index = 2;

	String first = names[index];

	String cut = first.substring(0, 3);

	String reversed = "";


		for(int count = cut.length() - 1; count >= 0; count--){
			 reversed += cut.charAt(count);
		}

		String remainder = first.substring(3);
		String add =  reversed +  remainder;

		names[index] = add;
				System.out.print(Arrays.toString(names));



}
}

	
