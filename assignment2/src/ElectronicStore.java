import java.util.*;

public class ElectronicStore {
    private final int MAX_PRODUCTS = 10;
    private String name;
    private double revenue = 0;
    private Product[] products = new Product[MAX_PRODUCTS];

    public ElectronicStore (String storename) {
        name = storename;
    }

    public void printStock() {
        for (int i = 0; i < products.length; i++) {
            if (!(products[i] == null)) {
                System.out.println(i + ". " + products[i]);
            }
        }
    }

    public boolean addProduct(Product p) {
        for (int i = 0; i < MAX_PRODUCTS; i++) {
            if (products[i] == null ){
                products[i] = p;
                return true;
            }
        }
        return false;
    }

    public String getName(){
        return name;
    }

    public void sellProducts() {
        System.out.print("sex");
        printStock();
        Scanner scanner = new Scanner(System.in);
        int pts = 0, am = 0;
        while (!(pts >= 0 && pts <= products.length)) {
            System.out.print("Enter the index of the product you want: ");
            pts = scanner.nextInt();
        }
        while (!(am > 0)) {
            System.out.print("Enter the amount you want: ");
            am = scanner.nextInt();
        }
        sellProducts(pts, am);
    }

    public void sellProducts(int prod, int amount) {
        if (prod <= products.length && products[prod] != null && prod >= 0 &&  amount >= 0) {
            revenue += products[prod].sellUnits(amount);
        }
    }

    public double getRevenue() {
        return revenue;
    }

    public boolean searchStock(String s) {
        for (int i = 0; i < products.length; i++) {
            if (products[i].toString().toLowerCase().contains(s.toLowerCase())) {
                return true;
            }
        }
        return false;

    }




}
