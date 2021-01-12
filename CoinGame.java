public class CoinGame

{

    private int startingCoins = 10; // starting number of coins

    private int maxRounds = 5; // maximum number of rounds played



    public CoinGame(int s, int r)

    {

        startingCoins = s;

        maxRounds = r;
        playGame();

    }



    /** Returns the number of coins (1, 2, or 3) that player 1 will spend.

     */

    public int getPlayer1Move(int round)

    {

        /* implementation not shown. */
        if (round == 1){
            return 2;
        }

        if (round == 2){
            return 2;
        }

        if (round == 3){
            return 1;
        }

        if (round == 4){
            return 2;
        }

        if (round == 5){
            return 3;
        }

        else{
            return 1;
        }

    }



    /** Returns the number of coins (1, 2, or 3) that player 2 will spend, as described in part (a).

     */

    public int getPlayer2Move(int round)

    {
        int result;
        /* to be implemented in part (a) */
        if ((round % 3) == 0){
            result = 3;
        }

        else if ((round % 2) == 0){
            result = 2;
        }

        else{
            result = 1;
        }

        return  result;

    }



    /** Plays a simulated game between two players, as described in part (b).

     */

    public void playGame()

    {

        /* to be implemented in part (b) */

        int player1coins = startingCoins;
        int player2coins = startingCoins;
        int round = 1;

        while ((round < maxRounds) && (player1coins > 3) && (player2coins > 3) ){
            getPlayer1Move(round);
            getPlayer2Move(round);

            if (getPlayer2Move(round) == getPlayer1Move(round)){
                player2coins++;
            }

            if (((getPlayer2Move(round) - getPlayer1Move(round)) == 1) || ((getPlayer2Move(round) - getPlayer1Move(round)) == -1 )){
                player2coins++;
            }

            if (((getPlayer2Move(round) - getPlayer1Move(round)) == 2) || ((getPlayer2Move(round) - getPlayer1Move(round)) == -2 )){
                player1coins += 2;
            }

            round++;

        }

        if (player1coins == player2coins){
            System.out.println("Tie Game");
        }

        if (player1coins > player2coins){
            System.out.println("player 1 wins");
        }

        if (player1coins < player2coins){
            System.out.println("player 2 wins");
        }


    }

}
