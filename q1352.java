import java.util.ArrayList;
import java.util.List;

class q1352 {
    private List<Integer> products;
    private List<Integer> prefixProducts;
    private int lastZeroIndex;

    public ProductOfNumbers() {
        products = new ArrayList<>();
        prefixProducts = new ArrayList<>();
        prefixProducts.add(1);
        lastZeroIndex = -1;
    }

    public void add(int num) {
        products.add(num);
        if (num == 0) {
            lastZeroIndex = products.size() - 1;
            prefixProducts.clear();
            prefixProducts.add(1);
        } else {
            int prev = prefixProducts.isEmpty() ? 1 : prefixProducts.get(prefixProducts.size() - 1);
            prefixProducts.add(prev * num);
        }
    }

    public int getProduct(int k) {
        int n = products.size();
        if (lastZeroIndex >= n - k) {
            return 0;
        }
        int size = prefixProducts.size();
        if (k >= size) {
            return 0;
        }
        return prefixProducts.get(size - 1) / prefixProducts.get(size - 1 - k);
    }
}