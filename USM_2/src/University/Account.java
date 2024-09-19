package University;
import java.util.Date;

public class Account {
    private String accountId, accountType;
    private double amount;
    private Date time;

    public Account(String accountId, String accountType, double amount, Date time) {
        this.accountId = accountId;
        this.accountType = accountType;
        this.amount = amount;
        this.time = time;
    }

    public String getAccountId() {
        return accountId;
    }
    public void setAccountType(String accountType) {
        this.accountType = accountType;
    }
    public String getAccountType() {
        return accountType;
    }
    public void setAmount(double amount) {
        this.amount = amount;
    }
    public double getAmount() {
        return amount;
    }
    public void setTime(Date time) {
        this.time = time;
    }
    public Date getTime() {
        return time;
    }

    @Override
    public String toString() {
        return "Account{" +
                "accountId='" + accountId + '\'' +
                ", accountType='" + accountType + '\'' +
                ", amount=" + amount +
                ", time=" + time +
                '}';
    }
}
