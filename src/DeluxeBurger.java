public class DeluxeBurger extends Burger{
    private double price;
    private String breadType;
    private String name;
    private String meat;


    private String chips = "chips";
    private String drink;

    public DeluxeBurger(){
        super("Bacon and Ham","Brown rye","Deluxe", 15);
        super.getAdditional1("Chips", 3);
        super.getAdditional2("Drinks", 1);
    }

    @Override
    public void getAdditional1(String name, double price) {
        System.out.println("Cannot add additional item");
    }

    @Override
    public void getAdditional2(String name, double price) {
        System.out.println("Cannot add additional item");
    }

    @Override
    public void getAdditional3(String name, double price) {
        System.out.println("Cannot add additional item");
    }

    @Override
    public void getAdditional4(String name, double price) {
        System.out.println("Cannot add additional item");
    }
    // or


//    public DeluxeBurger(String meat, String breadType, double price, String drink){
//        super(meat, breadType, "Deluxe Burger",price );
//        this.drink = drink;
//        this.price = price;

//    }
//    @Override
//    public double getBurger(){
//        double price = super.getBurger();
//        System.out.println("Added " + this.chips + " and " + this.drink + " for the same price of " + this.price);
//        return price;
//    }
}
