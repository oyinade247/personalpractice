public class DivisibleNumbers{
	public static void main(String[] args){
	
	 for(int count = 100; count <= 200; count++){
		if(count % 6 == 0 || count % 5 == 0){
			System.out.printf("%d ",count);
		}
	}
	
	}
}