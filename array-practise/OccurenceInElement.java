import java.util.Arrays;
public class OccurenceInElement{
	public static void main(String[] args){

	String [] names = {"diviine","victor","john"};
	
	int index = 0;

	String first = names[index];

	char ch = 'i';
	int counter = 0;

		for(int count = 0; count < first.length() -1; count++){
			if(first.charAt(count) == ch){
				counter++;
			}
		}
		System.out.print(counter);


}
}




