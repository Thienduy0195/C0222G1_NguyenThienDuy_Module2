package added_excercises.hospital_excercise.models;

public class VipMedicalRecord extends MedicalRecord {
    private String vipType;
    private int vipTime;


    public VipMedicalRecord(int medicalRecordNumber, String medicalRecordCode, String patientName, String checkInDay, String checkOutDay, String reason, String vipType, int vipTime) {
        super(medicalRecordNumber, medicalRecordCode, patientName, checkInDay, checkOutDay, reason);
        this.vipType = vipType;
        this.vipTime = vipTime;
    }

    public String getVipType() {
        return vipType;
    }

    public void setVipType(String vipType) {
        this.vipType = vipType;
    }

    public int getVipTime() {
        return vipTime;
    }

    public void setVipTime(int vipTime) {
        this.vipTime = vipTime;
    }

    @Override
    public String toString() {
        return "[VIP MR] : " + super.toString() +
                "VIP TYPE='" + vipType +
                ", VIP PERIOD=" + vipTime;
    }

    @Override
    public String makeText() {
        return super.makeText() + "," + vipType + "," + vipTime;
    }
}
