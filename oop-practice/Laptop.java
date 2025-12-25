public class Laptop{

	private String brand;
	private String model;
	private String screen;
	private int numberOfKeys;
	private String color;


public Laptop(String brand, String model, String screen, int numberOfKeys,String color){
	this.brand = brand;
	this.model = model;
	this.screen = screen;
	this.numberOfKeys = numberOfKeys;
	this.color = color;


}

public void powerOn(){
	System.out.println("Laptop powering on");
}


public int getNumberOfKeys(){
	return numberOfKeys;
}

public double typingSpeed(int keyPressPerSeconds){

	return numberOfKeys/ keyPressPerSeconds;
}

public boolean checkKeys(){
	if(numberOfKeys > 40){
		return true;
	}
	return false;
}

}


