public class Animal {
    String type;
    String species;
    String name;

    //(a)   Write the complete Animal class. Your implementation must meet all specifications and conform to the behavior shown in the table.
    public Animal(String t, String s, String n){
        type = t;
        species = s;
        name = n;
    }


    public String toString(){
        System.out.println(name+" the "+species+" is a "+type);
        return null;
    }



}
