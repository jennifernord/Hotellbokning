import java.util.ArrayList;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        //Menyn
        Scanner scan = new Scanner(System.in);

        System.out.println("MENU\n1. Make a booking\n2. See your booking\n3. See all bookings\n4. See money balance\nEnter option here:");
        int option = scan.nextInt();

        //Om man väljer nr 1:
        if (option == 1) {
            ArrayList<String> bookings = new ArrayList<>();

            System.out.println("Enter name: ");
            bookings.add(scan.next());
            System.out.println("Enter number of seats needed: ");
            bookings.add(scan.next());

            for(String booking : bookings){

            }
        }
    }
}