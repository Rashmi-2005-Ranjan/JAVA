public class Book {
    public static int totalBooks ;
    public String title;
    public String author;
    public long isbn;
    public boolean isBorrowed;

    // Static initializer block to initialize static variables
    static {
        totalBooks = 0; // Initialize totalBooks to 0
    }

    // Instance initializer block to increment totalBooks when a new Book object is created
    {   //Object initializer block
        totalBooks++;
    }
    public Book(String title, String author, long isbn) {
        this.title = title;
        this.author = author;
        this.isbn = isbn;
        totalBooks++; // Increment totalBooks when a new Book object is created
    }
    Book(long isbn){
        this("Unknown Title", "Unknown Author", isbn);
    }
    public void borrowBook(){
        if(isBorrowed) {
            System.out.println("The book is already borrowed.");
        }else{
            this.isBorrowed = true;
            System.out.println("You have borrowed the book: " + title);
        }
    }
    public void returnBook(){
        if(isBorrowed){
            this.isBorrowed = false;
            System.out.println("You have returned the book: " + title);
        }else{
            System.out.println("The book was not borrowed.");
        }
    }

    public static int getTotalBooks(){
        return totalBooks;
    }

    public static void main(String[] args) {
        Book designOfThings=new Book ( "Design","Author", 1234567890123L);
        System.out.println ("Total books created: " + Book.getTotalBooks());
//        Book javaProgramming = new Book("Java Programming", "John Doe", 9876543210123L);
//        System.out.println("Total books created: " + Book.getTotalBooks());
        Book myBook = new Book(1234567890123L);
        designOfThings.borrowBook ();
        myBook.borrowBook ();
        designOfThings.borrowBook ();
        designOfThings.returnBook ();
        designOfThings.returnBook ();
    }
}