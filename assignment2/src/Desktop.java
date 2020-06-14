public class Desktop extends Product {
    private double cpu;
    private int ram;
    private int storage;
    private boolean ssd;
    private String profile;

    public Desktop (double p, int q, double ghz, int ramgb, boolean hdd, int storagegb, String prof) {
        super(p, q);
        cpu = ghz;
        ram = ramgb;
        storage = storagegb;
        ssd = hdd;
        profile = prof;
    }

    @Override
    public double sellUnits(int amount) {
        return super.sellUnits(amount);
    }

    @Override
    public String toString() {
        if (ssd) {
            return profile + " Desktop PC with " + cpu + "ghz CPU, " + ram + "GB RAM, " + storage + "GB SSD drive.\n (" + getPrice() + " dollars each, " + getStockQuantity() + " in stock, " + getSoldQuantity() + " sold)";
        }
        else {
            return profile + " Desktop PC with " + cpu + "ghz CPU, " + ram + "GB RAM, " + storage + "GB HDD drive.\n (" + getPrice() + " dollars each, " + getStockQuantity() + " in stock, " + getSoldQuantity() + " sold)";
        }

    }
}
