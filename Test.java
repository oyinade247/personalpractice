import java.util.Arrays;
import java.util.ArrayList;

public class Test{
	static ArrayList<Object[]>fat = new ArrayList<Object[]>(); 
	public static void main (String... args){

		Object [] fathia = {1, "oyin" }; 
		fat.add(fathia);
		for(Object fat : fathia){
			System.out.print(Arrays.toString(fat));
		}
		
	}
}