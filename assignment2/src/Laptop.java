public class Laptop extends Product {
    double cpu;
    int ram;
    int storage;
    boolean ssd;
    int screen;

    public Laptop (double p, int q, double ghz, int ramgb, boolean hdd, int storagegb, int size) {
        super(p, q);
        cpu = ghz;
        ram = ramgb;
        storage = storagegb;
        ssd = hdd;
        screen = size;
    }

    public String toString () {
        if (ssd) {
            return screen + "\" Laptop PC with " + cpu + "ghz CPU, " + ram + "GB RAM, " + storage + "GB SSD drive.\n (" + getPrice() + " dollars each, " + getStockQuantity() + " in stock, " + getSoldQuantity() + " sold)";
        }
        else {
            return screen + "\" Laptop PC with " + cpu + "ghz CPU, " + ram + "GB RAM, " + storage + "GB HDD drive.\n (" + getPrice() + " dollars each, " + getStockQuantity() + " in stock, " + getSoldQuantity() + " sold)";
        }

    }
}
