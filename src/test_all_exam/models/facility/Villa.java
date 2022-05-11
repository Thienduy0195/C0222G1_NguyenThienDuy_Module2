package test_all_exam.models.facility;

public class Villa extends NewFacility {
    private double poolArea;

    public Villa() {
    }

    public Villa(String id, String name, double cost, double poolArea) {
        super(id, name, cost);
        this.poolArea = poolArea;
    }



    public double getPoolArea() {
        return poolArea;
    }

    public void setPoolArea(double poolArea) {
        this.poolArea = poolArea;
    }


    @Override
    public String toString() {
        return super.toString() +
                "poolArea=" + poolArea;
    }

    @Override
    public String makeText() {
        return super.makeText() + "," + poolArea;
    }
}
