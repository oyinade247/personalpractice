import java.util.ArrayList;
public class PhoneStore{
	private String storeName;
	private ArrayList <Phone> phones;


public PhoneStore(String storeName){
	this.storeName = storeName;
	phones = new ArrayList<>();

}


public void addPhone(Phone phone){
	phones.add(phone);

}

public void sellPhone(String phoneName, double amount){
	for(Phone phone : phones){
		if(phone.getBrandName().equals(phoneName) && phone.getPrice() == amount){
			phones.remove(phone);
				
		}

	}

}



public ArrayList<Phone> showAllPhones(){
	return phones;

}


}