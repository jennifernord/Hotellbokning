import java.util.Scanner;

public class Animal {
    Food myFood;
    String name;
    Scanner scan = new Scanner(System.in);

    public Animal(){
        getInfo();
    }

    private void getInfo() {
        System.out.println("What animal are you? ");
        this.name= scan.nextLine();
        myFood= new Food();
    }

    public Food getFood() {
        return this.myFood;
    }
}

