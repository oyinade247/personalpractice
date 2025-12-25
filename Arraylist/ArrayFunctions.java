public class ArrayFunctions{
	Object [] array;


	

public ArrayFunctions(){
 array = new Object[0];

}

public int size(){
	return array.length;

}

public void add(String item){

Object [] newArray = new Object[array.length + 1];

	for(int count = 0; count < array.length; count++){
		newArray[count] = array[count];
	}
	newArray[array.length] = item;
	array = newArray;
	


}





}