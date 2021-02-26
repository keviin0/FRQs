public class BookListing {
    double price;
    Book book;
    public BookListing(Book b, double value){
        price = value;
        book = b;

    }

    public void printDescription(){
        book.printBookInfo();
        System.out.println(", $"+ price);
    }

}
