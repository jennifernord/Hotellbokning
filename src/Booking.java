import java.util.ArrayList;
import java.util.Scanner;

public class Booking {
    Scanner scan = new Scanner(System.in);
    private String guestName;
    private int tableNum;

    public Booking(String guestName, int tableNum){
        this.guestName = guestName;
        this.tableNum = tableNum;
    }

    public String getGuestName() {
        return guestName;
    }

    public int getTableNum() {
        return tableNum;
    }

    //Metod för att lägga till namn på bokning
    public void addBooking(){
        ArrayList<Booking> bookings = new ArrayList<>();

        System.out.println("Enter name of guest: ");
        scan.nextLine();
        String guestName = scan.nextLine();
        System.out.println("Enter number of seats needed: ");
        int tableNum = scan.nextInt();

        bookings.add(new Booking(guestName, tableNum));

        for (Booking booking : bookings){
            System.out.println("Name: " +booking.getGuestName() +"\nTable seats: " +booking.getTableNum());
        }
    }
}
