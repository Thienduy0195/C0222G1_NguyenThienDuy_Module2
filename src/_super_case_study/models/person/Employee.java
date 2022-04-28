package _super_case_study.models.person;

public class Employee extends Person {
    public String level;
    public String position;
    public double salary;

    public Employee(String id,
                    String name,
                    String dateOfBirth,
                    boolean gender,
                    String identityCard,
                    String phoneNumber,
                    String email,
                    String level,
                    String position,
                    double salary) {
        super(id, name, dateOfBirth, gender, identityCard, phoneNumber, email);
        this.level = level;
        this.position = position;
        this.salary = salary;
    }

    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
}
