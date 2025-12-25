import java.util.Arrays;
public class NameToUpperCase{
	public static void main(String[] args){

	String [] names = {"divine","victor","john"};

	for (int i = 0; i < names.length; i++) {
		names[i] = names[i].toUpperCase();
	}

	for(String name : names){
		System.out.println(name);
	}

	

}
}
