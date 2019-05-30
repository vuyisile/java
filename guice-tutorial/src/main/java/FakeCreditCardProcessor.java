public class FakeCreditCardProcessor implements CreditCardProcessor {
    //    to avoid charging a real credit card!

    int amount;
    CreditCard creditCard;
    public FakeCreditCardProcessor(CreditCard creditCard){
        this.creditCard = creditCard;
    }
    public CreditCard getCardOfOnlyCharge() {
        return this.creditCard;
    }

    public int getAmountOfOnlyCharge() {
        return 100;
    }

    @Override
    public ChargeResult charge(CreditCard creditCard, Object amount) {
        return new ChargeResult(true);
    }
}
