package DependancyInjection;

public class PaymentService {
    private final PaymentRepository repository;
    private final EmailService emailService;
    private final LoggerService loggerService;

    // Injecting multiple dependencies
    public PaymentService(PaymentRepository repository, EmailService emailService, LoggerService loggerService) {
        this.repository = repository;
        this.emailService = emailService;
        this.loggerService = loggerService;
    }

    public void pay(double amount) {

        loggerService.log("Starting payment");

        repository.savePayment(amount);

        emailService.sendEmail(
                "Your payment of " + amount + " was successful"
        );

        loggerService.log("Payment completed");
    }
}
