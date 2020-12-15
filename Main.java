import java.lang.*;
public class Main {

    public static void main(String[] args){
        //a
        LightSequence gradShow = new LightSequence("0101 0101 0101");
        gradShow.display();

        //b
        gradShow.display();

        //c
        gradShow.changeSequence("0011 0011 0011");
        gradShow.display();

        //d
        String resultSeq = gradShow.insertSegment("1111 1111", 4);
        gradShow.display();

        //e
        String sequence = gradShow.getSequence();
        sequence = sequence.replaceFirst(sequence, "");
        gradShow.display();

        //f
        int a = 2;
        int b = 2;
        double result = Math.sqrt(Math.pow(a, 2) + Math.pow(b, 2));
        System.out.println(result);
    }

}
