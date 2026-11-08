package DependancyInjection;

public class MySQLPaymentRepository implements PaymentRepository{
    @Override
    public void savePayment(double amount) {
        System.out.println("Payment Saved:" + amount);
    }
}
