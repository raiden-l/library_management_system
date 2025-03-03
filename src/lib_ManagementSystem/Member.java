package lib_ManagementSystem;
import java.util.ArrayList;

public class Member {
	private String name;
	private ArrayList<Book> borrowedBooks = new ArrayList<>();
	
	public Member(String name) {
		this.name = name;
	}
	
	public void borrowBook(Library library, String title) {
		Book book = library.searchBook(title);
		if(book != null) {
			if(book.getAvb()) {
				borrowedBooks.add(book);
			}
			book.borrowBook();
		}
		else {
			System.out.println("Book not found in this library.");
		}
	}
	
	public void returnBook(Library library, String title) {
		Book book = library.searchBook(title);
		boolean bookReturned = false;
		for(int i = 0; i < borrowedBooks.size(); i++) {
			if(borrowedBooks.get(i).getTitle() == title) {
				book.returnBook();
				bookReturned = true;
				borrowedBooks.remove(book);
			}
		}
		if(!bookReturned) {
			System.out.println(name + " does not possess " + title);
		}
	}
	
	public void displayBooks() {
		System.out.println("Displaying " + name + "'s books...");
		for(int i = 0; i < this.borrowedBooks.size(); i++) {
			System.out.println((i + 1) + ". " + borrowedBooks.get(i));
		}
	}
}