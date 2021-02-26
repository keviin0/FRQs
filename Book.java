public class Book {

    private String title;
    private String author;

    public Book(String t, String a)
    {
        title = t;
        author = a;
    }


    public void printBookInfo()
    {
        System.out.print(title + ", written by " + author);
    }

}
