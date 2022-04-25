package _super_case_study.models.facility;

public abstract class Facility {
    public String id;
    public String serviceName;
    public double usingArea;
    public double rentCost;
    public double maximumMember;
    public String typeOfUsing;

    public Facility(String id, String serviceName,
                    double usingArea, double rentCost,
                    double maximumMember, String typeOfUsing) {
        this.id = id;
        this.serviceName = serviceName;
        this.usingArea = usingArea;
        this.rentCost = rentCost;
        this.maximumMember = maximumMember;
        this.typeOfUsing = typeOfUsing;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getServiceName() {
        return serviceName;
    }

    public void setServiceName(String serviceName) {
        this.serviceName = serviceName;
    }

    public double getUsingArea() {
        return usingArea;
    }

    public void setUsingArea(double usingArea) {
        this.usingArea = usingArea;
    }

    public double getRentCost() {
        return rentCost;
    }

    public void setRentCost(double rentCost) {
        this.rentCost = rentCost;
    }

    public double getMaximumMember() {
        return maximumMember;
    }

    public void setMaximumMember(double maximumMember) {
        this.maximumMember = maximumMember;
    }

    public String getTypeOfUsing() {
        return typeOfUsing;
    }

    public void setTypeOfUsing(String typeOfUsing) {
        this.typeOfUsing = typeOfUsing;
    }
}
