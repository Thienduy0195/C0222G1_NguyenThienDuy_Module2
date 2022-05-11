package added_excercises.hospital_excercise.models;

public class NormalMedicalRecord extends MedicalRecord{
    private double hospitalFees;

    public NormalMedicalRecord() {
    }

    public NormalMedicalRecord(int medicalRecordNumber, String medicalRecordCode, String patientName, String checkInDay, String checkOutDay, String reason, double hospitalFees) {
        super(medicalRecordNumber, medicalRecordCode, patientName, checkInDay, checkOutDay, reason);
        this.hospitalFees = hospitalFees;
    }

    public double getHospitalFees() {
        return hospitalFees;
    }

    public void setHospitalFees(double hospitalFees) {
        this.hospitalFees = hospitalFees;
    }

    @Override
    public String toString() {
        return  "[NORMAL MR] : " + super.toString() +
                "HOSPITAL FEE=" + hospitalFees;
    }

    @Override
    public String makeText() {
        return super.makeText() + "," + hospitalFees;
    }
}
