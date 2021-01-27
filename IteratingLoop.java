public class IteratingLoop {
    public static void main(String[] args) {
        String[] words = {"ten", "fading", "post", "card", "thunder", "hinge", "trailing", "batting"};


        for( String i : words){
            if (i.endsWith("ing")) {

                System.out.println(i);
            }


        }

    }

    public void run() {
        String[] words = {"ten", "fading", "post", "card", "thunder", "hinge", "trailing", "batting"};


        for( String i : words){
            if (i.endsWith("ing")) {

                System.out.println(i);
            }


        }
    }

}
