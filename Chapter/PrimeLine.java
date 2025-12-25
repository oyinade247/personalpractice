public class PrimeLine{
	public static void main(String[] args){

	int prime = 1000;
	int  number = 2;
	int numberOfLines = 10;
	for(int count = 0; count < prime; count++){
		boolean isPrime = true;

		for(int counter = 2; count < prime; count++){
			if(prime % counter == 0){
				isPrime = false;
			}
		}

		if(count % numberOfLines == 0){
			System.out.print(number);
		}else{
			System.out.print(number + " ");
		}
			

	}
		number++;
}
}