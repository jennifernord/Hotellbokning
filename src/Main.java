import java.util.ArrayList;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        //Menyn
        Scanner scan = new Scanner(System.in);
        String menu = "y";

        System.out.println("MENU\n1. Make a booking\n2. See your booking\n3. See all bookings\n4. See money balance\nEnter option here:");
        int option = scan.nextInt();

        //Om man väljer nr 1:
        if (option == 1) {
            ArrayList<Guest> guests = new ArrayList<>();
            ArrayList<String> seatsNum = new ArrayList<>();

            System.out.println("Enter name: ");
            scan.nextLine();
            guests.add(scan.next());

            for (Guest guest: guests){
                seatsNum.add(guest.addTable());
            }

            //test att det funkar
            System.out.println("Guest has name " + guests + " and needs " + seatsNum + " seats.");
        }
        if (option == 2) {

        }
    }
}