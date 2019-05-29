public class InMemoryTransactionLog implements TransactionLog{
    @Override
    public void logChargeResult(ChargeResult result) {

    }

    @Override
    public void logConnectException(Exception e) {

    }

    public boolean wasSuccessLogged() {
        return true;
    }
}
