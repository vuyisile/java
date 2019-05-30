public class PaypalCreditCardProcessor implements CreditCardProcessor {
    @Override
    public ChargeResult charge(CreditCard creditCard, Object amount) {
        return new ChargeResult(true);
    }
}