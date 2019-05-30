public class PizzaOrder {
    ChargeResult chargeResult = new ChargeResult(true);

    public PizzaOrder(int i) {
        System.out.println(i);
    }

    public Receipt getAmount() {
        return new Receipt();
    }
}
