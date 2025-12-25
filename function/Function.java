public class Functions{

	public static void main(String [] args){
		String word =   "python is sweet";
		String vowels = "aeiou";
		System.out.print(numberOfVowel(word, vowels));
	}

public static int numberOfVowel(String word, String vowel){
	int countVowels = 0;
	

	for(int count = 0; count < word.length(); count++){
		char letters = word.charAt(count);
		
		for(int counter = 0; counter < vowel.length(); counter++){
			if(letters == vowel.charAt(counter)){
				countVowels++;
			}
		}
	}
		return countVowels;

}






}