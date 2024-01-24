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
        Tables newTable = new Tables();
        allGuests.add(newGuest);
        allTables.add(newTable);
    }
}
