public class FakeCreditCardProcessor implements CreditCardProcessor {
    //    to avoid charging a real credit card!

    int fakeAmount = 100;
    CreditCard creditCard;
    public FakeCreditCardProcessor(CreditCard creditCard){
        this.creditCard = creditCard;
    }
    public CreditCard getCardOfOnlyCharge() {
        return this.creditCard;
    }

    public int getAmountOfOnlyCharge() {
        return this.fakeAmount;
    }

    @Override
    public ChargeResult charge(CreditCard creditCard, Object amount) {
        return new ChargeResult(true);
    }
}
