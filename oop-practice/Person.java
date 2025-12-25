public class Person{

	private int age;
	private String name;
	private int height ;


public Person(int age, String name, int height){
	this.name = name;
	this.age = age;
	this.height = height;

}


public int getAge(){
	return age + 5;

}

public void introduce(){

	System.out.print("My name is " + name + " my height is" + height);
}

}














