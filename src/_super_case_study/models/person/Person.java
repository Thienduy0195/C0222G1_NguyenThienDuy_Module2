package _super_case_study.models.person;

public abstract class Person {
    public int id;
    public String name;
    public String dateOfBirth;
    public boolean gender;
    public String identityCard;
    public String phoneNumber;
    public String email;

    public Person(int id, String name,
                  String dateOfBirth, boolean gender,
                  String identityCard, String phoneNumber,
                  String email) {
        this.id = id;
        this.name = name;
        this.dateOfBirth = dateOfBirth;
        this.gender = gender;
        this.identityCard = identityCard;
        this.phoneNumber = phoneNumber;
        this.email = email;
    }

    public int getId() {
        return id;
    }

    public void setId(int idPerson) {
        this.id = idPerson;
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

    public boolean isGender() {
        return gender;
    }

    public void setGender(boolean gender) {
        this.gender = gender;
    }

    public String getIdentityCard() {
        return identityCard;
    }

    public void setIdentityCard(String identityCard) {
        this.identityCard = identityCard;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "ID='" + id + '\'' +
                ", NAME='" + name + '\'' +
                ", DATE OF BIRTH='" + dateOfBirth + '\'' +
                ", GENDER=" + gender +
                ", IDENTITY CARD=" + identityCard +
                ", PHONE NUMBER=" + phoneNumber +
                ", EMAIL='" + email;
    }
    public String makeText(){
        return id + "," + name + "," + dateOfBirth + "," + gender + "," + identityCard + "," + phoneNumber + "," + email;
    }
}
