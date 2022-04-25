package _super_case_study.models.facility;

public class House extends Facility {
    private String standardOfRoom;
    private int numOfFloor;

    public House(String id,
                 String serviceName,
                double usingArea,
                double rentCost,
                double maximumMember,
                String typeOfUsing,
                String standardOfRoom,
                int numOfFloor) {
        super(id, serviceName, usingArea, rentCost, maximumMember, typeOfUsing);
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


    @Override
    public String toString() {
        return "HOUSE: " +
                ", ID='" + id + '\'' +
                ", SERVICE NAME='" + serviceName + '\'' +
                ", USING AREA=" + usingArea +
                ", RENT COST=" + rentCost +
                ", MAXIMUM CAPACITY =" + maximumMember +
                ", TYPE='" + typeOfUsing + '\'' +
                ", STANDARD OF ROOM='" + standardOfRoom + '\'' +
                ", NUMBER OF FLOORS=" + numOfFloor + super.toString();
    }

}
