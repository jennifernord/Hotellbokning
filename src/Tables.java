import java.util.Scanner;

public class Tables {
    Scanner scan = new Scanner(System.in);
    protected int tableNum;

    public Tables() {
        tableInfo();
    }

    private void tableInfo() {
        System.out.println("Enter number of seats needed: ");
        tableNum = scan.nextInt();
        System.out.println("The guest needs " +tableNum +" seats.");
    }
}
