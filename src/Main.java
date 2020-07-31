public class Main {

    public static void main(String[] args) {
        Burger burger = new Burger("chicken","chiapata","one",5);
        burger.getAdditional1("tomato",1);
        burger.getAdditional2("cheese",2);

        System.out.println("Final price -> " + "$" + burger.getBurger());

        HealthyBurger n = new HealthyBurger("chicken",10);
        n.getAdditional5("Egg",2);
        n.getBurger();

        DeluxeBurger b = new DeluxeBurger();
        b.getBurger();


        }
    }

