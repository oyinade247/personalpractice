public class InstanceMethod{

	public static void main(String [] args){
		InstanceMethod add = new InstanceMethod();
		int numberOne = 20;
		int numberTwo = 40;
		int addition = add.sum(numberOne, numberTwo);
		System.out.print(addition);	
	}

public int sum(int a, int b){
		return a + b;
	}



}