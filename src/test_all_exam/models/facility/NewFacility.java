package test_all_exam.models.facility;

public abstract class NewFacility {
    public String id;
    public String name;
    public double cost;

    public NewFacility() {
    }

    public NewFacility(String id, String name, double cost) {
        this.id = id;
        this.name = name;
        this.cost = cost;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }


    @Override
    public String toString() {
        return "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", cost=" + cost;
    }

    public String makeText(){
        return id +"," + name + "," + cost;
    }
}
