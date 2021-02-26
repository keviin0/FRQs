public class Herbivore extends Animal {
    String species;
    String name;
//(b)   Write the complete Herbivore class. Your implementation must meet all specifications and conform to the behavior shown in the table.
    public Herbivore(String species, String name) {
        super("Herbivore", species, name);
        this.species = species;
        this.name = name;
    }

    @Override
    public String toString(){
        System.out.println(name+" the "+species+" is a herbivore");
        return null;
    }
}
