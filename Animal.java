public class Animal {
    String type;
    String species;
    String name;
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
