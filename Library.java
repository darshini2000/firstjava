package collections;

class Book {
    private String title;
    private String author;
    private int year;
    public Book(String title, String author, int year) {
        this.title = title;
        this.author = author;
        this.year = year;
    }
    public String getTitle() {
        return title;
    }
    public String getAuthor() {
        return author;
    }
    public int getYear() {
        return year;
    }
    public void displayDetails() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Year: " + year);
    }
}

 

class LibraryItem {
    private Book book;
    private int itemID;
    public LibraryItem(Book book, int itemID) {
        this.book = book;
        this.itemID = itemID;
    }
    public Book getBook() {
        return book;
    }

 

   public int getItemID() {
        return itemID;
    }

 

    public void displayDetails() {
        System.out.println("Item ID: " + itemID);
        book.displayDetails();
    }
}

 

 

// Inheritance: Creating a subclass that inherits from a superclass.
class BookWithAudio extends LibraryItem {
    private String audioFormat;

 

    public BookWithAudio(Book book, int itemID, String audioFormat) {
        super(book, itemID);
        this.audioFormat = audioFormat;
    }

 

    public String getAudioFormat() {
        return audioFormat;
    }

 

    public void displayDetails() {
        super.displayDetails();
        System.out.println("Audio Format: " + audioFormat);
    }
}

 

public class Library {
	public static void main(String[] args) {
        Book book = new Book("Java Programming", "John Doe", 2023);
        LibraryItem item = new LibraryItem(book, 1001);

 

        BookWithAudio audioBook = new BookWithAudio(book, 2001, "MP3");

 

        LibraryItem polymorphicItem = audioBook;

 

        System.out.println("Book Details:");
        book.displayDetails();

        System.out.println("\nLibrary Item Details:");
        item.displayDetails();

 

        System.out.println("\nAudio Book Details:");
        audioBook.displayDetails();

 

        System.out.println("\nPolymorphic Item Details:");
        polymorphicItem.displayDetails();
    }
}