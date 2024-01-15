import java.util.Scanner;

public class Booking {
    Scanner scan = new Scanner(System.in);
    private Guest guest;

    Booking(Guest guest){
        this.guest = guest;
    }

    //Lägga till namn på bokningen
    public void addGuest(String guestName){
        System.out.println("Enter name of guest: ");
        guestName = scan.nextLine();
    }

    //Antalet sittplatser som behövs
    public void addTable(int tableNum){
        System.out.println("Enter number of guests: ");
        int guestnum = scan.nextInt();
        System.out.println("Your table number is " +tableNum);
    }
}
