//Создайте обобщенный класс Book<T>, который представляет книгу в библиотеке. Каждая книга должна содержать параметр типа T для ее названия.
//Создайте обобщенный класс LibraryCard<K, V>, который представляет библиотечную карточку для определенной книги. Каждая карточка должна содержать параметры типов K для номера карточки и V для информации о книге.
//Создайте класс Library, который будет представлять библиотеку. У этого класса должны быть методы для добавления книг и выдачи библиотечных карточек.
//Добавьте метод для вывода информации о всех выданных книгах с их библиотечными карточками.

public class Main {
    public static void main(String[] args) {
    Library library = new Library();

    Book<String> book1 = new Book<>("Book 1");
    Book<String> book2 = new Book<>("Book 2");

    library.addBook(book1);
    library.addBook(book2);

    LibraryCard<Integer, Book<String>> card1 = new LibraryCard<>(1, book1);
    LibraryCard<Integer, Book<String>> card2 = new LibraryCard<>(2, book2);

    library.issueBook(card1);

    library.printIssuedBooks();
}
}
