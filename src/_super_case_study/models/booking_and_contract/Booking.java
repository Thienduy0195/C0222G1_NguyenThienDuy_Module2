package _super_case_study.models.booking_and_contract;

public class Booking {

    private int bookingId;
    private int customerId;
    private String customerName;
    private String customerType;
    private String facilityId;
    private String facilityName;
    private String serviceType;
    private String startDate;
    private String endDate;
    private boolean createContract;

    public Booking() {
    }

    public Booking(int bookingId, int customerId,
                   String customerName, String customerType,
                   String facilityId, String facilityName,
                   String serviceType, String startDate,
                   String endDate, boolean createContract) {
        this.bookingId = bookingId;
        this.customerId = customerId;
        this.customerName = customerName;
        this.customerType = customerType;
        this.facilityId = facilityId;
        this.facilityName = facilityName;
        this.serviceType = serviceType;
        this.startDate = startDate;
        this.endDate = endDate;
        this.createContract = createContract;
    }

    public int getBookingId() {
        return bookingId;
    }

    public void setBookingId(int bookingId) {
        this.bookingId = bookingId;
    }

    public int getCustomerId() {
        return customerId;
    }

    public void setCustomerId(int customerId) {
        this.customerId = customerId;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getCustomerType() {
        return customerType;
    }

    public void setCustomerType(String customerType) {
        this.customerType = customerType;
    }

    public String getFacilityId() {
        return facilityId;
    }

    public void setFacilityId(String facilityId) {
        this.facilityId = facilityId;
    }

    public String getFacilityName() {
        return facilityName;
    }

    public void setFacilityName(String facilityName) {
        this.facilityName = facilityName;
    }

    public String getServiceType() {
        return serviceType;
    }

    public void setServiceType(String serviceType) {
        this.serviceType = serviceType;
    }

    public String getStartDate() {
        return startDate;
    }

    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }

    public String getEndDate() {
        return endDate;
    }

    public void setEndDate(String endDate) {
        this.endDate = endDate;
    }

    public boolean isCreateContract() {
        return createContract;
    }

    public void setCreateContract(boolean createContract) {
        this.createContract = createContract;
    }

    @Override
    public String toString() {
        return "BOOKING: " +
                "ID=" + bookingId +
                ", CUSTOMER ID=" + customerId +
                ", CUSTOMER NAME=" + customerName +
                ", CUSTOMER TYPE=" + customerType +
                ", FACILITY ID=" + facilityId +
                ", SERVICE NAME=" + facilityName +
                ", SERVICE TYPE=" + serviceType +
                ", START DAY=" + startDate +
                ", END DAY=" + endDate +
                ", CONTRACT SIGNED=" + createContract;
    }


    public String makeText() {
        return bookingId +
                "," + customerId +
                "," + customerName +
                "," + customerType +
                "," + facilityId +
                "," + facilityName +
                "," + serviceType +
                "," + startDate +
                "," + endDate +
                "," + createContract;
    }
}
