public class Meal {
    private VegBurger vb;
    private ChickenBurger cb;
    private Pepsi p;
    private Coke c;
    public Meal() {
        vb = new VegBurger("Veg Burger", 50.0);
        cb = new ChickenBurger("Chicken Burger", 70.0);
        p = new Pepsi("Pepsi", 25.0);
        c = new Coke("Coke", 30.0);
    }

    public double prepareVegMeal() {
        return vb.getPrice()+c.price;
    }

    public double prepareNonVegMeal() {
        return cb.getPrice()+p.getPrice();
    }
}
