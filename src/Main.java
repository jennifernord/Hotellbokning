import java.util.ArrayList;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        //Menyn
        Scanner scan = new Scanner(System.in);
        ArrayList<Booking> bookings = new ArrayList<>();

        while (true) {
            System.out.println("MENU\n" +
                    "1. Make a booking\n" +
                    "2. See your booking\n" +
                    "3. See all bookings\n" +
                    "4. See money balance\n" +
                    "Enter option here:");

            try {
                int option = scan.nextInt();
                if (option == 1) {
                    //new addBooking();
                    System.out.println("Enter name of guest: ");
                    scan.nextLine();
                    String guestName = scan.nextLine();
                    System.out.println("Enter number of seats needed: ");
                    int tableNum = scan.nextInt();

                    bookings.add(new Booking(guestName, tableNum));

                    for (Booking booking : bookings) {
                        System.out.println("Name: " + booking.getGuestName() + "\nTable seats: " + booking.getTableNum());
                    }
                } else if (option == 2) {
                    for (Booking booking : bookings) {
                        System.out.println("Name: " + booking.getGuestName() + "\nTable seats: " + booking.getTableNum());
                    }
                } else {
                    throw new Exception("Exception message");
                }

                break;

            } catch (Exception e) {
                scan.nextLine();
                System.out.println("Please try again");
            }
        }
    }
}