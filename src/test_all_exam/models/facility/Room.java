package test_all_exam.models.facility;

public class Room extends NewFacility {

    public Room() {
    }

    public Room(String id, String name, double cost) {
        super(id, name, cost);
    }

    @Override
    public String toString() {
        return "ROOM: " + super.toString();
    }


    @Override
    public String makeText() {
        return super.makeText();
    }
}
