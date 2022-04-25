package _super_case_study.models.facility;

public class Room extends Facility {
    private String freeService;

    public Room(String id,
                String serviceName,
                double usingArea,
                double rentCost,
                double maximumMember,
                String typeOfUsing,
                String freeService) {
        super(id, serviceName, usingArea, rentCost, maximumMember, typeOfUsing);
        this.freeService = freeService;
    }

    public String getFreeService() {
        return freeService;
    }

    public void setFreeService(String freeService) {
        this.freeService = freeService;
    }


    @Override
    public String toString() {
        return "ROOM: " +
                ", ID='" + id + '\'' +
                ", SERVICE NAME='" + serviceName + '\'' +
                ", USING AREA=" + usingArea +
                ", RENT COST=" + rentCost +
                ", MAXIMUM CAPACITY =" + maximumMember +
                ", TYPE='" + typeOfUsing + '\'' +
                ", FREE SERVICE='" + freeService + super.toString();
    }
}
