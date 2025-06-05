package in.challenges.firstquestion;

public class LibraryItem {
    private int itemId;
    private String title;
    private String author;

    public void checkout(){
        System.out.println ("Checked Out Successfully");
    }
    public void returnItem(){
        System.out.println ("Item Returned Successfully");
    }
}
