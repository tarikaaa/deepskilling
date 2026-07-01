package EcommerceSearch;
import java.util.Arrays;
import java.util.Comparator;

public class Main {

    public static void main(String[] args) {

        Product[] products = {

                new Product(101, "Laptop", "Electronics"),
                new Product(102, "Phone", "Electronics"),
                new Product(103, "Mouse", "Accessories"),
                new Product(104, "Keyboard", "Accessories"),
                new Product(105, "Speaker", "Audio"),
                new Product(106, "Monitor", "Electronics"),
                new Product(107, "Tablet", "Electronics")

        };

        System.out.println("===== Linear Search =====");

        Product result1 = LinearSearch.search(products, "Keyboard");

        if (result1 != null) {
            result1.display();
        } else {
            System.out.println("Product not found.");
        }

        Arrays.sort(products, Comparator.comparing(product -> product.productName));

        System.out.println("\n===== Binary Search =====");

        Product result2 = BinarySearch.search(products, "Keyboard");

        if (result2 != null) {
            result2.display();
        } else {
            System.out.println("Product not found.");
        }

    }
}