package _super_case_study.models.person;

public class Customer extends Person {
    private String typeOfCustomer;
    private String address;

    public Customer(String id,
                    String name,
                    String dateOfBirth,
                    boolean gender,
                    String identityCard,
                    String phoneNumber,
                    String email, String typeOfCustomer, String address) {
        super(id, name, dateOfBirth, gender, identityCard, phoneNumber, email);
        this.typeOfCustomer = typeOfCustomer;
        this.address = address;
    }
    public String getTypeOfCustomer() {
        return typeOfCustomer;
    }

    public void setTypeOfCustomer(String typeOfCustomer) {
        this.typeOfCustomer = typeOfCustomer;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "typeOfCustomer='" + typeOfCustomer + '\'' +
                ", address='" + address + '\'' +
                "} " + super.toString();
    }
}
