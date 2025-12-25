public class LengthOfString{
	public static void main(String [] args){

	String [] words = {"cat", "elephant", "dog"};
	
		String highest = "";
		for(int count = 0; count < words.length; count++){
			if(words.length > highest.length){
				highest = words.length;
			}

		}
		System.out.print(highest);
			



	}
}