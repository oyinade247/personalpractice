public class Book{

	private String title;
	private String authorName;
	private int pages;

public Book(String title, String authorName, int pages){
	this.title = title;
	this.authorName =  authorName;
	this.pages = pages;

}


public void open(){
	System.out.println("The book has  open");

}

public String bookDescription(String authorName){
	return authorName;
}

public boolean checkBook(){
	if (pages > 200){
		return true;
	}
		return false;
}


}
