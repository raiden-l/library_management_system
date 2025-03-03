package lib_ManagementSystem;
import java.util.ArrayList;

public class Library {
	private ArrayList<Book> library = new ArrayList<>();

	public void addBook(Book book) {
		this.library.add(book);
		System.out.println(book + " successfully added.");
	}
	
	public void removeBook(String title) {
		int libSize = this.library.size();
		System.out.println("Removing " + title + "...");
		for(int i = 0; i < this.library.size(); i++) {
			if(this.library.get(i).getTitle() == title) {
				this.library.remove(i);
				System.out.println(title + " successfully removed.");
			}
		}
		if(this.library.size() == libSize) {
			System.out.println(title + " not found. No books were removed.");
		}
	}
	
	public void displayBooks() {
		System.out.println("Displaying books...");
		for(int i = 0; i < this.library.size(); i++) {
			System.out.println((i + 1) + ". " + library.get(i));
		}
	}
	
	public Book searchBook(String title) {
		Book book = null;
		boolean found = false;
		System.out.println("Searching for " + title + "...");
		for(int i = 0; i < library.size(); i++) {
			if(title == library.get(i).getTitle()) {
				book = library.get(i);
				found = true;
				if(library.get(i).getAvb()) {
					System.out.println(library.get(i) + " - Available");
				}
				else {
					System.out.println(library.get(i) + " - Unavailable");
				}
			}
		}
		if(!found) {
			System.out.println(title + " not found.");
		}
		return book;
	}
}
