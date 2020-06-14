public class Product {
    private double price;
    private int stockQuantity;
    private int soldQuantity;

    public Product (double unitprice, int quantity) {
        price = unitprice;
        stockQuantity = quantity;
    }

    public double sellUnits (int amount) {
        if (stockQuantity >= amount) {
            stockQuantity -= amount;
            soldQuantity += amount;
            return (amount * price);
        }

        return 0.0;
    }

    public double getPrice() {
        return  price;
    }

    public int getStockQuantity() {
        return stockQuantity;
    }

    public int getSoldQuantity() {
        return  soldQuantity;
    }
}
