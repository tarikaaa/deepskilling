package EcommerceSearch;
public class BinarySearch {

    public static Product search(Product[] products, String productName) {

        int low = 0;
        int high = products.length - 1;

        while (low <= high) {

            int mid = (low + high) / 2;

            int compare = products[mid].productName.compareToIgnoreCase(productName);

            if (compare == 0) {
                return products[mid];
            }

            if (compare < 0) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }

        }

        return null;
    }
}