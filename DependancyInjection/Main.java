package DependancyInjection;

public class Main {

    public static void main(String[] args) {

        // Create dependencies
        PaymentRepository repository =new MySQLPaymentRepository();
        EmailService emailService = new EmailService();
        LoggerService loggerService = new LoggerService();

        // Inject all dependencies
        PaymentService paymentService = new PaymentService(repository, emailService, loggerService);

        // Execute
        paymentService.pay(500);
    }
}
