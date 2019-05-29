public class PaypalCreditCardProcessor implements CreditCardProcessor {
    @Override
    public ChargeResult charge(CreditCard creditCard, Object amount) {
        Object res = {CreditCard: creditCard, amount}
        return creditCard;
    }
}
