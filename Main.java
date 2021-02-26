import java.lang.*;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args){
       /* // Unit 4 Q1
        longestStreak execute = new longestStreak();
        execute.longestStreak("CCAAAAATTT!"); //

        // Unit 4 Q2
        CoinGame executeTwo = new CoinGame(10,5);

        // Unit 6 Q1
        IteratingLoop test1 = new IteratingLoop();
        test1.run();
        System.out.println();

        // Unit 6 Q2
        Payroll test = new Payroll();
        test.computeWages(10.0,1.5); */

        // Unit 8 FRQ
        /*
        Plot[][] plotArray = new Plot[3][3];
        Plot a = new Plot("corn",30);
        for (int row = 0; row < plotArray.length; row++) {
            for (int col = 0; col < plotArray[row].length; col++) {
                plotArray[row][col] = a;
            }
        }
        ExperimentalFarm f = new ExperimentalFarm(plotArray);
        System.out.println(f.getHighestYield("corn"));
        System.out.println(f.sameCrop(0));
        System.out.println(f.sameCrop(1)); */

        //Unit 9
        PictureBook myBook = new PictureBook("Peter and Wendy", "J.M. Barrie",
                "F.D. Bedford");
        myBook.printBookInfo();

        //(b)   Write a code segment that can be used to replace /* missing code */ so that book1 and book2 will be correctly created and added to myLibrary. Assume that class PictureBook works as intended, regardless of what you wrote in part (a).
        //
        //The BookListing class is used to generate a descriptive listing for a book. The BookListing constructor takes a Book object and a double value as parameters and uses them to print information about the book, along with its price.
        //Assume that book1 and book2 were created as specified in part (b). The following table demonstrates the intended behavior of the BookListing class using objects book1 and book2.
        ArrayList<Book> myLibrary = new ArrayList<Book>();
        Book book1 = new Book("Frankenstein","Mary Shelley");
        PictureBook book2 = new PictureBook("The Wonderful Wizard Of Oz", "L. Frank Baum",
                "W.W. Denslow");
        myLibrary.add(book1);
        myLibrary.add(book2);

        BookListing listing1 = new BookListing(book1, 10.99);
        listing1.printDescription();

        BookListing listing2 = new BookListing(book2, 12.99);
        listing2.printDescription();

        Animal lisa = new Animal("carnivore", "lion", "Lisa");
        lisa.toString();


        Herbivore gary = new Herbivore("giraffe", "Gary");
        gary.toString();


        Elephant percy = new Elephant("Percy", 2.0);
        percy.toString();







    }

}
