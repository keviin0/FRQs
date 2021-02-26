public class Herbivore extends Animal {
    String species;
    String name;

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
