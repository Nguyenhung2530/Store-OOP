package product;

import java.util.ArrayList;
import java.util.List;

public class ProductManager {
    private List<Product> products = new ArrayList<>();

    public void addProduct(Product p) {
        products.add(p);
    }

    public void listProducts() {
        for (Product p : products) {
            p.showInfo();
        }
    }

    public Product findProductById(String id) {
        for (Product p : products) {
            if (p.getProductId().equals(id)) {
                return p;
            }
        }
        return null;
    }

    public List<Product> getProducts() {
        return products;
    }
}
