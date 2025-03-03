package libraryManagementSystem;


public class LibraryManagementMain {

	public static void main(String[] args) {
		Book book1 = new Book("Animal Farm", "George Orwell", false);
		Book book2 = new Book("The Crucible", "Arthur Miller", true);
		Book book3 = new Book("Harry Potter", "J.K. Rowling", true);
		
		Member Raiden = new Member("Raiden");
		Member Andrew = new Member("Andrew");
		
		Library library = new Library();
		
		library.addBook(book1);
		library.addBook(book2);
		library.addBook(book3);
		
		System.out.println();
		
		library.displayBooks();
		System.out.println();
		Raiden.borrowBook(library, "The Crucible");
		System.out.println();
		Andrew.borrowBook(library, "Animal Farm");
		System.out.println();
		library.removeBook("The Giver");
		System.out.println();
		library.searchBook("The Crucible");
		System.out.println();
		library.searchBook("The Menagerie");
		System.out.println();
		Raiden.returnBook(library, "The Crucible");
		System.out.println();
		library.searchBook("The Crucible");
	}

}
