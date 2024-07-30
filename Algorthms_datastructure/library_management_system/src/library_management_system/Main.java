package library_management_system;

public class Main {

	public static void main(String[] args) {
		Library library = new Library(5);

        // Add books
        library.addBook(new Book("B001", "The Great Gatsby", "F. Scott Fitzgerald"));
        library.addBook(new Book("B002", "1984", "George Orwell"));
        library.addBook(new Book("B003", "To Kill a Mockingbird", "Harper Lee"));
        library.addBook(new Book("B004", "The Catcher in the Rye", "J.D. Salinger"));
        library.addBook(new Book("B005", "Pride and Prejudice", "Jane Austen"));

        // Traverse and print all books
        System.out.println("All Books:");
        library.traverseBooks();

        // Linear search for a book by title
        System.out.println("\nLinear Search for '1984':");
        Book foundBookLinear = library.linearSearchByTitle("1984");
        if (foundBookLinear != null) {
            System.out.println("Found: " + foundBookLinear);
        } else {
            System.out.println("Book not found.");
        }

        // Sort books by title
        library.sortBooksByTitle();

        // Traverse and print all books after sorting
        System.out.println("\nAll Books (Sorted by Title):");
        library.traverseBooks();

        // Binary search for a book by title
        System.out.println("\nBinary Search for '1984':");
        Book foundBookBinary = library.binarySearchByTitle("1984");
        if (foundBookBinary != null) {
            System.out.println("Found: " + foundBookBinary);
        } else {
            System.out.println("Book not found.");
        }

	}

}
