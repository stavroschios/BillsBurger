public class Burger {

    private String meat;
    private String breadType;
    private String name;
    private double price;

    private String add1;
    private double add1Price;
    private String add2;
    private double add2Price;
    private String add3;
    private double add3Price;
    private String add4;
    private double add4Price;

    public Burger(String meat, String breadType, String name, double price) {
        this.meat = meat;
        this.breadType = breadType;
        this.name = name;
        this.price = price;
    }

    public void getAdditional1(String name, double price){
        this.add1 = name;
        this.add1Price = price;
    }
    public void getAdditional2(String name, double price){
        this.add2 = name;
        this.add2Price = price;
    }
    public void getAdditional3(String name, double price){
        this.add3 = name;
        this.add3Price = price;
    }
    public void getAdditional4(String name, double price){
        this.add4 = name;
        this.add4Price = price;
    }



    public double getBurger(){
        double price = this.price;
        System.out.println("This" + this.name + " on a " + this.breadType + " roll "
                            + " price is " + this.price);

        if(this.add1 != null){
            price += add1Price;
            System.out.println("Added " + this.add1 + " for an extra " + this.add1Price);
        }
        if(this.add2 != null){
            price += add2Price;
            System.out.println("Added " + this.add2 + " for an extra " + this.add2Price);
        }
        if(this.add3 != null){
            price += add3Price;
            System.out.println("Added " + this.add3 + " for an extra " + this.add3Price);
        }
        if(this.add4 != null){
            price += add4Price;
            System.out.println("Added " + this.add4 + " for an extra " + this.add4Price);
        }

        return price;

    }


}
