import java.util.HashMap;
import java.util.Map;

public class Library {
private Map<LibraryCard<Integer, Book>, Book> issuedBooks;

public Library() {
    issuedBooks = new HashMap<>();
}

public void addBook(Book<String> book) {
    LibraryCard<Integer, Book<String>> card = new LibraryCard<>(issuedBooks.size()+1, book);
    issuedBooks.put(card, book);
}

public void issueBook(LibraryCard<Integer, Book<String>> card) {
    issuedBooks.remove(card);
}

public void printIssuedBooks() {
    for (Map.Entry<LibraryCard<Integer, Book<String>>, Book<String>> entry : issuedBooks.entrySet()) {
        System.out.println("Card Number: " + entry.getKey().getCardNumber());
        System.out.println("Book Title: " + entry.getValue().getTitle());
    }
}
}
