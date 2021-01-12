public class longestStreak {
    //     The method longestStreak is intended to determine the longest substring of consecutive identical characters in the parameter str and print the result.
    public static void main(String[] args) {
        longestStreak("CCAAAAATTT!");
    }



    public static void longestStreak(String str){

        // create temporary variables and final variables
        char tempChar = 'a';
        char longestCharacter = 'a';
        int highestCount = 0;
        int tempCount = 0;

        // loop through string
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);

            // skip first character since there is nothing to compare it to
            if (i == 0) {
                tempChar = c;
                longestCharacter = c;
                tempCount = 1;
                continue;
            }
            // check if c and temp are the same
            if (tempChar == c) {
                tempCount++;

                // check if tempCount is greater than current highestCount
                if (tempCount > highestCount){
                  //  System.out.println("+");
                    longestCharacter = c;
                    highestCount = tempCount;
                }

            }

            // set new temp
            else {
                tempChar = c;
                tempCount = 1;
            }
        }

        System.out.println(longestCharacter + " " + highestCount);


    }

    }
