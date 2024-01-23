import java.util.Scanner;

public class Guest {
    Scanner scan = new Scanner(System.in);
    protected String name;
    Tables table;

    //constructor
    public Guest(String name, Tables table){
        this.name = name;
        this.table = table;
    }
    public String getName() {
        return name;
    }

    public String addTable(){
        System.out.println("How many seats are needed? :");
        String tableNum = scan.nextLine();
        this.table = new Tables(tableNum, this);
        return tableNum;
    }
}
