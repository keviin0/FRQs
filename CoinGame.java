public class CoinGame

{

    /* (a)   You will write method getPlayer2Move, which returns the number of coins that player 2 will spend in a given round of the game. In the first round of the game, the parameter round has the value 1, in the second round of the game, it has the value 2, and so on. The method returns 1, 2, or 3 based on the following rules.

If round is divisible by 3, then return 3.
If round is not divisible by 3 but is divisible by 2, then return 2.
If round is not divisible by 3 and is not divisible by 2, then return 1.
Complete method getPlayer2Move below by assigning the correct value to result to be returned. */

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
        // random implementation created by team

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
        /*
The game ends when maxRounds rounds have been played or when a player’s coin count is less than 3 at the end of a round.

At the end of the game, the winner is determined according to the following rules.

If both players have the same number of coins at the end of the game, the method prints "tie game".
If player 1 has more coins than player 2, the method prints "player 1 wins".
If player 2 has more coins than player 1, the method prints "player 2 wins".
(b)   Assume that getPlayer2Move works as specified, regardless of what you wrote in part (a) . You must use getPlayer1Move and getPlayer2Move appropriately to receive full credit.
*/
        /* to be implemented in part (b) */

        int player1coins = startingCoins;
        int player2coins = startingCoins;
        int round = 1;

        while ((round < maxRounds) && (player1coins > 3) && (player2coins > 3) ){
            int player1move = getPlayer1Move(round);
            int player2move = getPlayer2Move(round);
            player2coins -= player2move;
            player1coins -= player1move;


            if (player2move == player1move){
                player2coins++;
            }

            if ((player1move - player2coins == 1) || ((player1move - player2move) == -1 )){
                player2coins++;
            }

            if (((player1move - player2coins) == 2) || ((player1move - player2coins) == -2 )){
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
