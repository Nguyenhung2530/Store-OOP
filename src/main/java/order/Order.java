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
        System.out.println("Khách hàng: " + customerName + ". Tổng tiền: " + total + " VND.");
        paymentMethod.pay(total);
    }
}
