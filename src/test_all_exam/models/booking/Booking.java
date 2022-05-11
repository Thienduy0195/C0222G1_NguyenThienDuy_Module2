package test_all_exam.models.booking;

public class Booking {
    private int bookingId;
    private String customerId;
    private String facilityId;
    private String startDate;
    private String endDate;

    public Booking() {
    }

    public Booking(int bookingId, String customerId, String facilityId, String startDate, String endDate) {
        this.bookingId = bookingId;
        this.customerId = customerId;
        this.facilityId = facilityId;
        this.startDate = startDate;
        this.endDate = endDate;
    }

    public int getBookingId() {
        return bookingId;
    }

    public void setBookingId(int bookingId) {
        this.bookingId = bookingId;
    }

    public String getCustomerId() {
        return customerId;
    }

    public void setCustomerId(String customerId) {
        this.customerId = customerId;
    }

    public String getFacilityId() {
        return facilityId;
    }

    public void setFacilityId(String facilityId) {
        this.facilityId = facilityId;
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

    @Override
    public String toString() {
        return "Booking{" +
                "bookingId=" + bookingId +
                ", customerId='" + customerId + '\'' +
                ", facilityId='" + facilityId + '\'' +
                ", startDate='" + startDate + '\'' +
                ", endDate='" + endDate + '\'' +
                '}';
    }

    public String makeText() {
        return bookingId + "," + customerId + "," + facilityId + "," + startDate + "," + endDate;
    }
}
