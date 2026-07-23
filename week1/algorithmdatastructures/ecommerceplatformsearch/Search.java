package week1.algorithmdatastructures.ecommerceplatformsearch;

public class Search {
    public static int binarySearch(Product[] products, int targetId) {
        int left = 0;
        int right = products.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (products[mid].getProductId() == targetId) {
                return mid; 
            } else if (products[mid].getProductId() < targetId) {
                left = mid + 1; 
            } else {
                right = mid - 1; 
            }
        }
        return -1;
    }
}
