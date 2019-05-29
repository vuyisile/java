public class FakeCreditCardProcessor implements CreditCardProcessor {
    //    to avoid charging a real credit card!

    int amount;
    CreditCard creditCard;
    public CreditCard getCardOfOnlyCharge() {
        return creditCard;
    }

    public int getAmountOfOnlyCharge() {
        return amount;
    }

    @Override
    public ChargeResult charge(CreditCard creditCard, Object amount) {
        return null;
    }
}
