package _super_case_study.models.facility;

public class Room extends Facility {
    private String freeService;

    public Room(String serviceName,
                double usingArea,
                double rentCost,
                double maximumMember,
                String typeOfUsing,
                String freeService) {
        super(serviceName, usingArea, rentCost, maximumMember, typeOfUsing);
        this.freeService = freeService;
    }

    public String getFreeService() {
        return freeService;
    }

    public void setFreeService(String freeService) {
        this.freeService = freeService;
    }
}
