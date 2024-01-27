import java.util.ArrayList;
import java.util.Scanner;

public class Booking {
    ArrayList<Guest> allGuests = new ArrayList<>();
    ArrayList<Tables> allTables = new ArrayList<>();

    public Booking(){
        Menu();
    }

    private void Menu(){
        Guest newGuest = new Guest();
        allGuests.add(newGuest);
        Tables newTable = new Tables();
        allTables.add(newTable);
        System.out.println("NAME: " +newGuest.guestName +"\nSEATS: " +newTable.tableNum);
    }
}
