import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        //Menyn
        Scanner scan = new Scanner(System.in);

        while (true) {
            System.out.println("MENU\n" +
                    "1. Make a booking\n" +
                    "2. See all bookings\n" +
                    "Enter option here:");

            try {
                int option = scan.nextInt();
                if (option == 1) {
                    new Booking();
                } else if (option == 2) {
                    System.out.println("Work in progress.");
                } else {
                    throw new Exception("Exception message");
                }

            } catch (Exception e) {
                scan.nextLine();
                System.out.println("Please try again");
            }
        }
    }
}