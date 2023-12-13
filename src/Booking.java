import java.util.Scanner;

public class Booking {
    Scanner scan = new Scanner(System.in);
    private Guest guest;

    Booking(Guest guest){
        this.guest = guest;
    }

    public void addGuest(String guestName){
        System.out.println("Enter name of guest: ");
        guestName = scan.nextLine();

    }
}
