package exam_modules2.models;

public class SaveBankAccount extends BankAccount {
    private double saveMoney;
    private String saveDate;
    private double rate;
    private int period;

    public SaveBankAccount() {
    }

    public SaveBankAccount(int id, String accountCode, String holderName, String createDate, double saveMoney, String saveDate, double rate, int period) {
        super(id, accountCode, holderName, createDate);
        this.saveMoney = saveMoney;
        this.saveDate = saveDate;
        this.rate = rate;
        this.period = period;
    }

    public double getSaveMoney() {
        return saveMoney;
    }

    public void setSaveMoney(double saveMoney) {
        this.saveMoney = saveMoney;
    }

    public String getSaveDate() {
        return saveDate;
    }

    public void setSaveDate(String saveDate) {
        this.saveDate = saveDate;
    }

    public double getRate() {
        return rate;
    }

    public void setRate(double rate) {
        this.rate = rate;
    }

    public int getPeriod() {
        return period;
    }

    public void setPeriod(int period) {
        this.period = period;
    }

    @Override
    public String toString() {
        return "SAVING BANK ACCOUNT: " +super.toString() +
                "SAVING MONEY=" + saveMoney +
                ", SAVING DAY=" + saveDate + '\'' +
                ", RATE=" + rate +
                ", PERIOD=" + period;
    }

    public String makeText() {
        return super.makeText() + "," + saveMoney + "," + saveDate + "," +rate + "," +period;
    }
}
