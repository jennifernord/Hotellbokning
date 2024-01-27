import java.util.ArrayList;

public class Zoo {
    ArrayList<Animal> myAnimals= new ArrayList<Animal>();
    ArrayList<Food> allFood= new ArrayList<Food>();
    public Zoo(){
        initZoo();
    }

    private void initZoo() {
        Animal anAnimal= new Animal();
        Food theFood= anAnimal.getFood();
        allFood.add(theFood);
        myAnimals.add(anAnimal);
    }
}
