import java.util.*;
public class ElectronicStoreTester {
    public static void main(String[] args) {
        ElectronicStore store = new ElectronicStore("Extra");
        store.printStock();
        String input = "";
        Scanner scanner = new Scanner(System.in);
        while (!input.equals("quit")) {
            System.out.print("Enter a term to search for: ");
            input = scanner.next();
            if (!input.equals("quit")) {
                boolean match = store.searchStock(input);
                if (match) {
                    System.out.println("A matching item is contained in the store's stock.");
                }
                else {
                    System.out.println("No items in the store's stock match that term.");
                }
            }
        }
    }
}
