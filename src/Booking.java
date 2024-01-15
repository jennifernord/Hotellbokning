import java.util.Scanner;

public class Booking {
    Scanner scan = new Scanner(System.in);
    private Guest guest;
    private Tables table;
    private Booking booking;

    public Guest getGuest() {
        return guest;
    }

    public Booking(Guest guest, Tables table, Booking booking){
        this.guest = guest;
        this.table = table;
        this.booking = booking;
    }

    //Lägga till namn på bokningen
    public void addGuest(String guestName){
        System.out.println("Enter name of guest: ");
        guestName = scan.nextLine();
    }

    //bordsnummer på bokningen
    public void addTable(){
        System.out.println("Enter number of guests: ");
        int tableNum = scan.nextInt();
        System.out.println("Your table number is " +tableNum);
    }
}
