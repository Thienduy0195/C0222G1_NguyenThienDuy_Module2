package _super_case_study.models.facility;

public class Room extends Facility {
    private String freeService;

    public Room(String id,
                String serviceName,
                double usingArea,
                double rentCost,
                int maximumMember,
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
        return "ROOM: " + super.toString() +
                ", FREE SERVICE='" + freeService;
    }

    @Override
    public String makeText() {
        return super.makeText() +
                "," + freeService;
    }
}
