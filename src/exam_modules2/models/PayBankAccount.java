package exam_modules2.models;

public class PayBankAccount extends BankAccount {
    private String cardNumber;
    private double innerMoney;

    public PayBankAccount() {
    }

    public PayBankAccount(int id, String accountCode, String holderName, String createDate, String cardNumber, double innerMoney) {
        super(id, accountCode, holderName, createDate);
        this.cardNumber = cardNumber;
        this.innerMoney = innerMoney;
    }

    public PayBankAccount(int id, String accountCode, String holderName, String createDate) {
        super(id, accountCode, holderName, createDate);
    }



    public String getCardNumber() {
        return cardNumber;
    }

    public void setCardNumber(String cardNumber) {
        this.cardNumber = cardNumber;
    }

    public double getInnerMoney() {
        return innerMoney;
    }

    public void setInnerMoney(double innerMoney) {
        this.innerMoney = innerMoney;
    }

    @Override
    public String toString() {
        return "PAYMENT BANK ACCOUNT{" +super.toString() +
                "CARD NUMBER='" + cardNumber +
                ", INNER MONEY=" + innerMoney;
    }

    public String makeText() {
        return super.makeText() + "," + cardNumber + "," + innerMoney;
    }
}
