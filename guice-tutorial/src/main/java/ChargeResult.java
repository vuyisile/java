public class ChargeResult {
    boolean isSuccess = false;
    public ChargeResult(boolean success){
        this.isSuccess = success;
    }
    boolean wasSuccessful(){
        return isSuccess;
    }

    public String getDeclineMessage(){
        return "";
    }

}
