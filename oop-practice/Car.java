public class Car{

	private String brand;
	private String model;
	private int year;
	private String color;
	private double speed;

public Car(String brand, String model, int year, String color, double speed){
	this.brand = brand;
	this.model = model;
	this.year = year;
	this.color = color;
	this.speed = speed;

}

public void drive(){
	System.out.println("the car is driving at " + speed + "" + "km");
}

public void printCarBrand(){
	System.out.print("The car brand is" + brand);
}

public void printCarModel(){
	System.out.println("The car model is " + model);
}

public void printCarYear(){
	System.out.println("The car year is " + year);
}

public double timetaken(double distance){

	return distance / speed;
}


}
