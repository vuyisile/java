public interface CreditCardProcessor {
    ChargeResult charge(CreditCard creditCard, Object amount);
}
