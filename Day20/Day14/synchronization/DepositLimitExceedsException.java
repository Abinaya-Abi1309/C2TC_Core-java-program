package C2TC_CORE_JAVA_PROGRAM.src.Day14.synchronization;

public class DepositLimitExceedsException extends Exception {

    public DepositLimitExceedsException()
    {
        super("Daily limit of Deposit is exceeded..");
    }
    public DepositLimitExceedsException(String message)
    {
        super(message);
    }
}