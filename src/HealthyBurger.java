public class HealthyBurger extends Burger{
        private String breadType;
        private double price;
        private String name;


        private String add5;
        private double add5Price;

        private String add6;
        private double add6Price;


        public HealthyBurger(String meat, double price){
                super(meat,"Brown rye","Healthy", price);
        }

        public void getAdditional5(String name, double price){
                this.add5 = name;
                this.add5Price = price;
        }


        public void getAdditional6(String name, double price){
                this.add6 = name;
                this.add6Price = price;
        }

        @Override
        public double getBurger(){
                double price = super.getBurger();
                if(this.add5 != null){
                        price += this.add5Price;
                        System.out.println("Added " + this.add5 + " for an extra " + this.add5Price);
                }
                if(this.add6 != null){
                        price += this.add6Price;
                        System.out.println("Added " + this.add6 + " for an extra " + this.add6Price);
                }
                        return price;
        }

}
