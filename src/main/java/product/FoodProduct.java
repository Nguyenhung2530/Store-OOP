package product;

import java.util.Date;

public class FoodProduct extends Product{

    private Date expirationDate;
    private String origin ;
    private double weight;

    public FoodProduct(String productId, String productName, double price, int quantity, String category, Date expirationDate, String origin, double weight ) {
        super(productId, productName, price, quantity, category);
        this.expirationDate = expirationDate;
        this.origin = origin;
        this.weight = weight;
    }

    public Date getExpirationDate() {
        return expirationDate;
    }

    public String getOrigin() {
        return origin;
    }

    public double getWeight() {
        return weight;
    }

    @Override
    public void showInfo() {
        System.out.println("Thực phẩm: " + getProductName() + " | Giá: " + getPrice() + " | Số lượng: " + getQuantity() + " | Xuất xứ: " + origin + " | Khối lượng: " + weight + " kg" + " | HSD: " + expirationDate);
    }

}
