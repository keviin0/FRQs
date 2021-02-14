import java.lang.*;
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
        System.out.println(f.sameCrop(1));
    }

}
