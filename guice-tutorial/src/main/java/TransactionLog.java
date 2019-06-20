public interface TransactionLog {
    void logChargeResult(ChargeResult result);
    void logConnectException(Exception e);
}
