package test_all_exam.models.facility;

public class House extends NewFacility {

    public House() {
    }

    public House(String id, String name, double cost) {
        super(id, name, cost);
    }

    @Override
    public String toString() {
        return "HOUSE: " + super.toString();
    }


    @Override
    public String makeText() {
        return super.makeText();
    }
}
