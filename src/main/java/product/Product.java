package product;

public abstract class Product {

    private String productId;
    private String productName;
    private double price;
    private int quantity;
    private String category;

    public Product(String productId, String productName, double price, int quantity, String category) {
        this.productId = productId;
        this.productName = productName;
        this.price = price;
        this.quantity = quantity;
        this.category = category;
    }

    public String getProductId() {
        return productId;
    }

    public String getProductName() {
        return productName;
    }

    public double getPrice() {
        return price;
    }

    public int getQuantity() {
        return quantity;
    }

    public String getCategory() {
        return category;
    }

    public void setName(String productName) { this.productName = productName; }
    public void setPrice(double price) { this.price = price; }

    public abstract void showInfo();
}
