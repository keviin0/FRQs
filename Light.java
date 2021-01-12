public class Light {
    public static void main(String[] args){

        // 1) a) Write a statement to create a LightSequence object gradShow that has the initial light sequence "0101 0101 0101".
    LightSequence gradShow = new LightSequence("0101 0101 0101");
        gradShow.display();

    //b)  Write a statement that will call the display method to display the light sequence for the gradShow object.
        gradShow.display();

    //c) Write a statement that will be used to update the gradShow light sequence to "0011 0011 0011".
        gradShow.changeSequence("0011 0011 0011");
        gradShow.display();

    //d) Write a code segment that will call the insertSegment method to insert the segment "1111 1111" in the current
    // sequence for gradShow at index 4. The resulting sequence will be stored in the string resultSeq.
    String resultSeq = gradShow.insertSegment("1111 1111", 4);
        gradShow.display();

    //e) Assume that the string oldSeq has been properly declared and initialized and contains the string segment.
    // Write a code segment that will remove the first occurrence of segment from oldSeq and store it in the string newSeq. Consider the following examples.
    //
    //If oldSeq is "1100000111" and segment is "11", then "00000111" should be stored in newSeq.
    //If oldSeq is "0000011" and segment is "11", then "00000" should be stored in newSeq.
    //If oldSeq is "1100000111" and segment is "00", then "11000111" should be stored in newSeq.
    //Write the code segment below. Your code segment should meet all specifications and conform to the examples.
    String sequence = gradShow.getSequence();
    sequence = sequence.replaceFirst(sequence, "");
        gradShow.display();

    //f) Two lights will be arranged on a two-dimensional plane. The vertical distance between the two lights is stored in the double variable a.
    // The horizontal distance between the two lights is stored in the double variable b.
    //
    //The straight-line distance between the two lights is given by the formula square root of the quantity a squared plus b squared.
    //
    //
    //
    //Write a code segment that prints the straight-line distance between the two lights according to the formula above.
    int a = 2;
    int b = 2;
    double result = Math.sqrt(Math.pow(a, 2) + Math.pow(b, 2));
        System.out.println(result);
        }
}
