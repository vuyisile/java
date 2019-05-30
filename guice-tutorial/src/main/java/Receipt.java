public class Receipt {
    static ChargeResult hasSuccessfulCharge = new ChargeResult(true);
    public static Receipt forSuccessfulCharge(Receipt amount) {
        return amount;
    }

    public static Receipt forDeclinedCharge(String declineMessage) {
        return Receipt.forDeclinedCharge(declineMessage);
    }

    public static Receipt forSystemFailure(String message) {
        return Receipt.forSystemFailure(message);
    }

    public static boolean hasSuccessfulCharge() {
        return hasSuccessfulCharge.isSuccess;
    }

    public int getAmountOfCharge() {
        return 100;
    }
}
