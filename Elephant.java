public class Elephant extends Herbivore {
    Double length;
    //(c)   Write the complete Elephant class. Your implementation must meet all specifications and conform to the behavior shown in the table.
    public Elephant(String name, Double length) {
        super("Elephant", name);
        this.length = length;
    }

    @Override
    public String toString(){
        System.out.println(name+" the elephant is a herbivore with tusks "+ length+ " meters long");
        return null;
    }
}
