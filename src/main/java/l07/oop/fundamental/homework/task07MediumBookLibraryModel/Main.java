package l07.oop.fundamental.homework.task07MediumBookLibraryModel;

public class Main {
    public static void main(String[] args) {
        Book b1 = new Book("Java Programming", "John Smith");
        Book b2 = new Book("Clean Code", "Robert C. Martin");
        Book b3 = new Book("The Hobbit", "J.R.R. Tolkien");

        Book[] books = {b1, b2, b3};
        Library library = new Library(books);

        library.displayBooks();
        System.out.println();
        b1.borrow();
        b1.borrow();
        b2.borrow();
        System.out.println();
        library.displayBooks();
        System.out.println();
        b2.returnBook();
        System.out.println();
        library.displayBooks();
    }
}
