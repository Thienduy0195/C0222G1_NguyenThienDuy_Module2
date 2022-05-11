package test_all_exam.models.person;

public class Customer {
    public String id;
    public String name;
    public String dateOfBirth;
    public boolean bookingStatus;

    public Customer() {
    }

    public Customer(String id, String name, String dateOfBirth, boolean bookingStatus) {
        this.id = id;
        this.name = name;
        this.dateOfBirth = dateOfBirth;
        this.bookingStatus = bookingStatus;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public boolean isBookingStatus() {
        return bookingStatus;
    }

    public void setBookingStatus(boolean bookingStatus) {
        this.bookingStatus = bookingStatus;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", dateOfBirth='" + dateOfBirth + '\'' +
                ", bookingStatus=" + bookingStatus +
                '}';
    }

    public String makeText(){
        return id+ "," + name+ "," +dateOfBirth+ "," +bookingStatus;
    }
}
