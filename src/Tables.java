import java.util.Scanner;

public class Tables {
    Scanner scan = new Scanner(System.in);

    private int tableNum;

    public Tables() {
        tableInfo();
    }

    private void tableInfo() {
        System.out.println("Enter number of seats needed: ");
        this.tableNum = scan.nextInt();
    }
}
