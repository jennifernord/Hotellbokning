public class Vip extends Guest{
    public Vip(String name, Tables table) {
        super(name, table);
    }

    public String addTable(){
        System.out.println("How many seats are needed? :");
        String tableNum = scan.nextLine();
        this.table = new Tables(tableNum, this);
        System.out.println("What add-on would you like?\n" +
                "1. Comedy show\n" +
                "2. Wine tasting\n" +
                "3. Cinema");
        String addOn = scan.nextLine();
        System.out.println(tableNum +" seats and a " +addOn);
        return tableNum;
    }

}
