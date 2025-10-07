package payment;

public class MomoPayment implements PaymentMethod {
    private String momoAccount;

    public MomoPayment(String momoAccount) {
        this.momoAccount = momoAccount;
    }

    @Override
    public void pay(double amount) {
        System.out.println("Thanh toán qua Momo (" + momoAccount + ") thành công (" + amount + " VND).");
    }
}
