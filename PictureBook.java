public class PictureBook extends Book {
    String illustrator;
    String title;
    String author;
    public PictureBook(String t, String a, String i) {

        super(t, a);
        illustrator = i;
        title = t;
        author = a;


    }
    @Override
    public void printBookInfo()
    {
        System.out.println(title + ", written by " + author + " illustrated by "+illustrator);
    }
}
