public class ToasterOven extends Product {
    private int wattage;
    private String color;
    private String brand;
    private int width;
    private boolean convection;

    public ToasterOven (double p, int q, int watts, String colour, String bran, int widt, boolean convec) {
        super(p, q);
        wattage = watts;
        color = colour;
        brand = bran;
        width = widt;
        convection = convec;
    }

    public String toString() {
        if (convection) {
            return width + " inch " + brand + " with convection (" + color + ", " + wattage + " watts)\n (" + getPrice() + " dollars each, " + getStockQuantity() + " in stock, " + getSoldQuantity() + " sold)";
        }
        return width + " inch " + brand + " (" + color + ", " + wattage + " watts)\n (" + getPrice() + " dollars each, " + getStockQuantity() + " in stock, " + getSoldQuantity() + " sold)";
    }
}
