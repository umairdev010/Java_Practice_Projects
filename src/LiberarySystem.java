public class LiberarySystem {
    public static void main(String[] args) {
        Book mybook = Book.createBook("THE WORLD OF ALL RICHS", "DR. UMAIR ", "W23e4R5t890O887");
        mybook.returnbook();
        mybook.returnbook();
        mybook.borrowbook();
        Book.totalBooks();
        mybook.printDetails();
        mybook.auther = "DR NAVEED";
        mybook.printDetails();

    }
}

class Book {
    String title;
    String auther;
    String isbn;

    private Book(String title, String auther, String isbn) {
        this.title = title;
        this.auther = auther;
        this.isbn = isbn;
    }

    static Book createBook(String title, String auther, String isbn) {
        return new Book(title, auther, isbn);
    }

    public void printDetails() {
        System.out.println("DETAILS FOR THE BOOK CREATED IS AS " + "AUTHER : " + this.auther + " TITLE : " + this.title + " ISBN : " + this.isbn);
    }

    static int totalBooks = 0;

    public void borrowbook() {
        totalBooks--;
    }

    public void returnbook() {
        totalBooks++;
    }

    public static void totalBooks() {
        System.out.println("TOTAL NUMBERS OF BOOKS ARE : " + totalBooks);
    }
}
