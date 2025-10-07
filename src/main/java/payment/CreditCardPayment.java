package payment;

public class CreditCardPayment implements PaymentMethod {
    private String cardNumber;

    public CreditCardPayment(String cardNumber) {
        this.cardNumber = cardNumber;
    }

    @Override
    public void pay(double amount) {
        System.out.println("Thanh toán bằng thẻ tín dụng [" + cardNumber + "] thành công (" + amount + " VND).");
    }
}
