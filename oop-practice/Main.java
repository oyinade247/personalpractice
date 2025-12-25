public class Main{

	public static void main(String [] args){
		Person person = new Person(13, "oyin", 14);
		BankAccount account = new BankAccount("oyinade", "0336261", 15.00);
		Car car = new Car("benz", "c3200", 2014, "white", 18.0);
		Book book = new Book("wise", "adekunle chisom", 15);
		School school = new School("oyin primary school", 15, "15 oremeji");
		Laptop laptop = new Laptop("dell", "edh4", "345", 43,"red");

		person.introduce();
		account.showBalance();
		car.drive();
		book.open();
		school.announceSchool();
		laptop.powerOn();

	}


}
This is where your methods can:

Accept input (parameters)

Change object values

Do simple calculations

Optionally print results or return values

Example ideas:

BankAccount: deposit(double amount), withdraw(double amount)

Car: accelerate(double amount) → increase speed

Person: haveBirthday() → increase age