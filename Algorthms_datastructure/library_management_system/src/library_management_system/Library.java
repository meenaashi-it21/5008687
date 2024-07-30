package library_management_system;
import java.util.Arrays;
public class Library {
	  private Book[] books;
	    private int size;

	    public Library(int capacity) {
	        books = new Book[capacity];
	        size = 0;
	    }

	    // Method to add a book
	    public void addBook(Book book) {
	        if (size >= books.length) {
	            books = Arrays.copyOf(books, books.length * 2); // Double the array size if full
	        }
	        books[size++] = book;
	    }

	    // Linear search to find books by title
	    public Book linearSearchByTitle(String title) {
	        for (int i = 0; i < size; i++) {
	            if (books[i].getTitle().equalsIgnoreCase(title)) {
	                return books[i];
	            }
	        }
	        return null;
	    }

	    // Binary search to find books by title (assuming the list is sorted)
	    public Book binarySearchByTitle(String title) {
	        int left = 0;
	        int right = size - 1;
	        while (left <= right) {
	            int mid = left + (right - left) / 2;
	            int comparison = books[mid].getTitle().compareToIgnoreCase(title);
	            if (comparison == 0) {
	                return books[mid];
	            }
	            if (comparison < 0) {
	                left = mid + 1;
	            } else {
	                right = mid - 1;
	            }
	        }
	        return null;
	    }

	    // Method to sort books by title (required for binary search)
	    public void sortBooksByTitle() {
	        Arrays.sort(books, 0, size, (b1, b2) -> b1.getTitle().compareToIgnoreCase(b2.getTitle()));
	    }

	    // Method to traverse and print all books
	    public void traverseBooks() {
	        for (int i = 0; i < size; i++) {
	            System.out.println(books[i]);
	        }
	    }
}
