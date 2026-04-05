package l07.oop.fundamental.homework.task07MediumBookLibraryModel;

public class Book {
    private String title;
    private String author;
    private boolean available;

    public Book(String title, String author) {
        this.title = title;
        this.author = author;
        this.available = true;
    }


    public void displayStatus() {
        String status = this.available ? "Available" : "Not Available";
        System.out.println(this.title + " " + this.author + " " + status);
    }

    public void borrow(){
        if(this.available){
            System.out.println("Borrowing " + this.title);
            this.available = false;
        }else{
            System.out.println(this.title + " Not Available");
        }
    }

    public void returnBook(){
        this.available = true;
        System.out.println("Returning " + this.title);
    }
}
