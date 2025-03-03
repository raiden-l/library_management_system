package lib_ManagementSystem;

public class Book {
	private String title;
	private String author;
	private boolean isAvailable;
	
	public Book(String title, String author, boolean isAvailable) {
		this.title = title;
		this.author = author;
		this.isAvailable = isAvailable;
	}
	
	public void borrowBook() {
		if(isAvailable) {
			System.out.println(this.title + " successfully borrowed.");
			this.isAvailable = false;
		}
		else {
			System.out.println(this.title + " is unavailable for borrow.");
		}
	}
	
	public void returnBook() {
		if(!isAvailable) {
			System.out.println(this.title + " has been returned.");
			this.isAvailable = true;
		}
		else {
			System.out.println(this.title + " is not checked out.");
		}
	}
	
	public String toString() {
		String bookTitle;
		bookTitle = this.title + " by " + this.author;
		return bookTitle;
	}
	
	public String getTitle() {
		return this.title;
	}
	
	public boolean getAvb() {
		return this.isAvailable;
	}
}
