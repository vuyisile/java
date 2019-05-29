public abstract class SquareCreditCardProcessor implements CreditCardProcessor {
    @Override
    public ChargeResult charge(CreditCard creditCard, Object amount) {
        return null;
    }
}
