public class Main {
    public static void main(String[] args) {
        CreditCardProcessor processor = new PaypalCreditCardProcessor();
        TransactionLog transactionLog = new DatabaseTransactionLog();
        BillingService billingService = new RealBillingService(processor, transactionLog);
    }
}
