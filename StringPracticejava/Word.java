public class Word{


	public static void main(String [] args){
		String hey = "madam";
		System.out.print(palindrome(hey));
	}


	public static String text(String word){

	StringBuilder build = new StringBuilder(word);
		return build.reverse().toString();
		
	}


	public static boolean palindrome(String word){

		String result = "";
		int length = word.length();
		for(int count = length ; count <= 0; count--){
			result += String.valueOf(word.charAt(count));
			
		}
			if(result.equals(word)){
				return true;
			}
			return false;


	}


}