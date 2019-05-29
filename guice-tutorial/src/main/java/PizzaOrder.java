public class PizzaOrder {
    ChargeResult chargeResult = new ChargeResult(true);
    int int1;

    public PizzaOrder(int i) {
        System.out.println(i);
    }

    public String getAmount() {
        return String.valueOf(int1);
    }
}
