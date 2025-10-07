package product;

public class ElectronicProduct extends Product {

    private String color;
    private int warranty;

    public ElectronicProduct(String productId, String productName, double price, int quantity, String category, String color, int warranty) {
        super(productId, productName, price, quantity, category);
        this.color = color;
        this.warranty = warranty;
    }

    public String getColor() {
        return color;
    }

    public int getWarranty() {
        return warranty;
    }

    @Override
    public void showInfo() {
        System.out.println("Điện tử: " + getProductName() + " | Giá: " + getPrice() + " | Màu sắc: " + color + " | BH: " + warranty + " tháng");
    }
}
