public class ManipulationStr{

	public static void main(String [] args){
		
		String word = "oyinade ade";
		char a = 'a';
		System.out.println(reversedWord(word));
		System.out.println(countVowel(word));
		System.out.println(checkIfAWordContains(word,a));
		System.out.println(removeSpace(word));
		System.out.println(largestLetter(word));
	}


	public static String reversedWord(String word){
		String reversed = "";
		for(int count = word.length()-1; count >= 0; count--){
			reversed += word.charAt(count);
		}
		return reversed;
	} 


	public static int countVowel(String word){
		int countVowels = 0;
		String [] vowels = {"a", "e", "i", "o", "u"};
		for(int count = 0; count < word.length(); count++){
			String letters = String.valueOf(word.charAt(count));
				
			for(int index = 0; index < vowels.length; index++){
				if(letters.equals(vowels[index])){
					countVowels++;
				}
				
			}
		}
		return countVowels;		

	}

	public static boolean checkIfAWordContains(String word, char letter){
		for(char let : word.toCharArray()){
			if(let == letter){
				return true;
			}
		}
		return false;
		

	}

	public static String removeSpace(String word){

	String newWord = word.replace(" ", "");
		return newWord;
	}

	public static String largestLetter(String word){
		char [] letter = word.toCharArray();
		char max = letter[0];
		String let = "";
			
		for(int count = 0; count < word.length(); count++){
			if(letter[count] > max ){
				max = letter[count];			
			}
			
		}
		let += max;
		return let;
	}


	

}