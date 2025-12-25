public class BankAccount{

	private String accountName;
	private String accountNumber;
	private double balance;


public BankAccount(String accountName, String accountNumber, double balance){
	this.accountName = accountName;
	this.accountNumber = accountNumber;
	this.balance = balance;


}


public void setName(String name){
	this.name = name;

}


public String getAccountNumber(){
	return accountNumber;
}

public String getName(){

	return name;
}



public void showBalance(){

	System.out.println("Your account balance is " + balance);
}


public double getBalance(){

	return balance;
}

public double deposit(int amount){
	return balance += amount;

}

public double withdraw(int amount){
	return balance -= amount; 

}
public boolean checkBalance(){

	if(balance < 50){
		return true;
	}
	return false;
}



}
