import java.util.Scanner;

public class Guest {
    Scanner scan = new Scanner(System.in);
    protected String guestName;
    Tables table;

    public Tables getTable() {
        return table;
    }

    //constructor
    public Guest(){
        guestInfo();
    }

    private void guestInfo() {
        System.out.println("Enter name: ");
        this.guestName = scan.nextLine();
    }
}
