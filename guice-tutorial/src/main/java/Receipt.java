public class Receipt {
    ChargeResult hasSuccessfulCharge = new ChargeResult(true);
    public static Receipt forSuccessfulCharge(Receipt amount) {
        return amount;
    }

    public static Receipt forDeclinedCharge(String declineMessage) {
        return Receipt.forDeclinedCharge(declineMessage);
    }

    public static String forSystemFailure(String message) {
        return message;
    }

    public ChargeResult hasSuccessfulCharge() {
        return hasSuccessfulCharge;
    }

    public int getAmountOfCharge() {
        return 100;
    }
}
