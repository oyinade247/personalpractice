public class Phone{
	private String brand;
	private String color;
	private String model;
	private double price;
	private String yearOfProduction;
	

public Phone( String brand,String color,String model,  String yearOfProduction){

	this.brand = brand;
	this.color = color;
	this.model = model;
	this.price = price;
	this.yearOfProduction = yearOfProduction;


}

public String getBrandName(){
	return brand;

} 

public String getPhoneColor(){

	return color;
}


public String getPhoneModel(){

	return model;
}



public String getYear(){

	return yearOfProduction;
}

public double getPrice(){

	return price;
}



}