package order;

import payment.PaymentMethod;
import product.Product;

import java.util.ArrayList;
import java.util.List;

public class Order {
    private String customerName;
    private List<OrderItem> items = new ArrayList<>();
    private PaymentMethod paymentMethod;

    public Order(String customerName, PaymentMethod paymentMethod) {
        this.customerName = customerName;
        this.paymentMethod = paymentMethod;
    }

    public void addItem(Product product, int quantity) {
        items.add(new OrderItem(product, quantity));
    }

    public double calculateTotal() {
        return items.stream().mapToDouble(OrderItem::getSubtotal).sum();
    }

    public void checkout() {
        double total = calculateTotal();
        System.out.println("Khách hàng: " + customerName);
        System.out.println("Danh sách sản phẩm đã mua:");

        for (OrderItem item : items) {
            System.out.println("- " + item.getProduct().getProductName() +
                    " | SL: " + item.getQuantity() +
                    " | Giá: " + item.getProduct().getPrice() +
                    " | Thành tiền: " + item.getSubtotal());
        }

        System.out.println("Tổng tiền: " + total + " VNĐ");
        paymentMethod.pay(total);
    }
}
