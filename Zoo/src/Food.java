import java.util.Scanner;

public class Food {
    String type;
    int amount;
    Scanner scan= new Scanner(System.in);

    public Food(){
        getInfo();
    }

    private void getInfo() {
        System.out.println("what type?");
        type= scan.nextLine();
        System.out.println("How much?");
        amount= scan.nextInt();
        scan.nextLine();

    }


}
