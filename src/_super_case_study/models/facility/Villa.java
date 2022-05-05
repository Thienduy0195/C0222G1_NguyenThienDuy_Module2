package _super_case_study.models.facility;

import java.io.Serializable;

public class Villa extends Facility implements Serializable {
    private String standardOfRoom;
    private double poolArea;
    private int numOfFloor;

    public Villa(String id,
                 String serviceName,
                 double usingArea,
                 double rentCost,
                 int maximumMember,
                 String typeOfUsing,
                 String standardOfRoom,
                 double poolArea,
                 int numOfFloor) {
        super(id, serviceName, usingArea, rentCost, maximumMember, typeOfUsing);
        this.standardOfRoom = standardOfRoom;
        this.poolArea = poolArea;
        this.numOfFloor = numOfFloor;
    }

    public String getStandardOfRoom() {
        return standardOfRoom;
    }

    public void setStandardOfRoom(String standardOfRoom) {
        this.standardOfRoom = standardOfRoom;
    }

    public double getPoolArea() {
        return poolArea;
    }

    public void setPoolArea(double poolArea) {
        this.poolArea = poolArea;
    }

    public int getNumOfFloor() {
        return numOfFloor;
    }

    public void setNumOfFloor(int numOfFloor) {
        this.numOfFloor = numOfFloor;
    }

    @Override
    public String toString() {
        return "VILLA: " +
                super.toString() +
                ", STANDARD OF ROOM='" + standardOfRoom + '\'' +
                ", POOL AREA=" + poolArea +
                ", NUMBER OF FLOOR=" + numOfFloor;
    }

    @Override
    public String makeText() {
        return super.makeText() +
                "," + standardOfRoom +
                "," + poolArea +
                "," + numOfFloor;
    }
}
