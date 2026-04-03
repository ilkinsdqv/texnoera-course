package l07.oop.fundamental.homework.task07MediumBookLibraryModel;

public class Library {
    private Book[] books;
    public Library(Book[] books) {
        this.books = books;
    }

    public void displayBooks() {
        System.out.println("Book list: ");
        for (Book book : books) {
            book.displayStatus();
        }
    }
}
