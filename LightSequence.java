public class LightSequence {

    public String sequence;


    public LightSequence(String seq)

    { sequence = seq;}



    /** Inserts the string segment in the current sequence,

     * starting at the index ind. Returns the new sequence.

     */

    public String insertSegment(String segment, int index){
        String newString = sequence.substring(0, index + 1) + segment + sequence.substring(index + 1);

        sequence = newString;
        return sequence;
    }



    /** Updates the sequence to the value in seq

     */

    public void changeSequence(String seq)

    { sequence = seq; }



    /** Uses the current sequence to turn the light on and off

     * for the show

     */

    public void display()

    { System.out.println(sequence); }

    public String getSequence() {return sequence;}



}


