package _super_case_study.models.facility;

public class House extends Facility {
    private String standardOfRoom;
    private int numOfFloor;

    public House(String serviceName,
                double usingArea,
                double rentCost,
                double maximumMember,
                String typeOfUsing,
                String standardOfRoom,
                int numOfFloor) {
        super(serviceName, usingArea, rentCost, maximumMember, typeOfUsing);
        this.standardOfRoom = standardOfRoom;
        this.numOfFloor = numOfFloor;
    }

    public String getStandardOfRoom() {
        return standardOfRoom;
    }

    public void setStandardOfRoom(String standardOfRoom) {
        this.standardOfRoom = standardOfRoom;
    }

    public int getNumOfFloor() {
        return numOfFloor;
    }

    public void setNumOfFloor(int numOfFloor) {
        this.numOfFloor = numOfFloor;
    }
}
