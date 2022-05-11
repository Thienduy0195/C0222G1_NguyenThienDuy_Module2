package exam_modules2.models;

public abstract class BankAccount {
    public int id;
    public String accountCode;
    public String holderName;
    public String createDate;

    public BankAccount() {
    }

    public BankAccount(int id, String accountCode, String holderName, String createDate) {
        this.id = id;
        this.accountCode = accountCode;
        this.holderName = holderName;
        this.createDate = createDate;
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getAccountCode() {
        return accountCode;
    }

    public void setAccountCode(String accountCode) {
        this.accountCode = accountCode;
    }

    public String getHolderName() {
        return holderName;
    }

    public void setHolderName(String holderName) {
        this.holderName = holderName;
    }

    public String getCreateDate() {
        return createDate;
    }

    public void setCreateDate(String createDate) {
        this.createDate = createDate;
    }

    @Override
    public String toString() {
        return "BANK ACCOUNT: " +
                "ID=" + id +
                ", ACCOUNT CODE='" + accountCode + '\'' +
                ", HOLDER'S NAME='" + holderName + '\'' +
                ", CREATE DATE='" + createDate ;
    }

    public String makeText() {
        return id + "," + accountCode + "," + holderName + "," + createDate;
    }
}
