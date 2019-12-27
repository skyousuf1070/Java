public class VegBurger extends Burger {
    public VegBurger(String name,double price) {
        this.name = name;
        this.price = price;
    }
    @Override
    public String getName() {
        return name;
    }

    @Override
    public double getPrice() {
        return price;
    }
}
