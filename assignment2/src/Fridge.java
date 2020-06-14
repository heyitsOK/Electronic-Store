public class Fridge extends Product {
    private double size;
    private boolean freezer;
    private String color;
    private int wattage;
    private String brand;

    public Fridge (double p, int q, int watts, String colour, String brandname, double sizeft, boolean freeze) {
        super(p, q);
        size = sizeft;
        freezer = freeze;
        color = colour;
        wattage = watts;
        brand = brandname;
    }

    @Override
    public String toString() {
        if (freezer) {
            return size + "' " + brand + " Fridge with Freezer (" + color + ")\n (" + getPrice() + " dollars each, " + getStockQuantity() + " in stock, " + getSoldQuantity() + " sold)";
        }
        else {
            return size + "' " + brand + " Fridge (" + color + ")\n (" + getPrice() + " dollars each, " + getStockQuantity() + " in stock, " + getSoldQuantity() + " sold)";
        }

    }
}
