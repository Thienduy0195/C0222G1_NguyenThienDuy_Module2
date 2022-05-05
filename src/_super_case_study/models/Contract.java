package _super_case_study.models;

public class Contract {
    private String contractId;
    private int bookingId;
    private double deposit;
    private double totalPayment;
    private String customerName;
    private int customerId;

    public Contract() {
    }

    public Contract(String contractId, int bookingId, double deposit, double totalPayment, String customerName, int customerId) {
        this.contractId = contractId;
        this.bookingId = bookingId;
        this.deposit = deposit;
        this.totalPayment = totalPayment;
        this.customerName = customerName;
        this.customerId = customerId;
    }

    public String getContractId() {
        return contractId;
    }

    public void setContractId(String contractId) {
        this.contractId = contractId;
    }

    public int getBookingId() {
        return bookingId;
    }

    public void setBookingId(int bookingId) {
        this.bookingId = bookingId;
    }

    public double getDeposit() {
        return deposit;
    }

    public void setDeposit(double deposit) {
        this.deposit = deposit;
    }

    public double getTotalPayment() {
        return totalPayment;
    }

    public void setTotalPayment(double totalPayment) {
        this.totalPayment = totalPayment;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public int getCustomerId() {
        return customerId;
    }

    public void setCustomerId(int customerId) {
        this.customerId = customerId;
    }

    @Override
    public String toString() {
        return "CONTRACT: " +
                "CONTRACT ID=" + contractId +
                ", BOOKING ID='" + bookingId + '\'' +
                ", DEPOSIT=" + deposit +
                ", TOTAL OF PAYMENT=" + totalPayment +
                ", CUSTOMER NAME=" + customerName +
                ", CUSTOMER ID=" + customerId;
    }

    public String makeText() {
        return contractId +
                "," + bookingId +
                "," + deposit +
                "," + totalPayment +
                "," + customerName +
                "," + customerId;
    }
}
