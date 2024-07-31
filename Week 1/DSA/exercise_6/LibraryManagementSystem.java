package exercise_6;

public class LibraryManagementSystem {
    public static void main(String[] args) {
        Library library = new Library();
        library.addBook(new Book(1, "Game Of Thrones", "George R. R. Martin"));
        library.addBook(new Book(2, "Harry Potter", "JK Rowling"));
        library.addBook(new Book(3, "Naruto", "Masashi Kishimoto"));
        library.addBook(new Book(3, "The Chronicles of Narnia", "C. S. Lewis and Clive Staples Lewis"));

        // Linear search
        System.out.println("Linear Search For One Piece");
        Book book = library.linearSearchByTitle("One Piece");
        if (book != null) {
            book.showDetails();
        } else {
            System.out.println("Book not found.");
        }

        // Binary search (assuming the list is sorted by title)
        System.out.println("\nBinary Search For One Piece:");
        book = library.binarySearchByTitle("One Piece");
        if (book != null) {
            book.showDetails();
        } else {
            System.out.println("Book not found.");
        }
    }
}
