package added_excercises.hospital_excercise.models;

public abstract class MedicalRecord {
    public int medicalRecordNumber;
    public String medicalRecordCode;
    public String patientName;
    public String checkInDay;
    public String checkOutDay;
    public String reason;


    public MedicalRecord() {
    }

    public MedicalRecord(int medicalRecordNumber, String medicalRecordCode, String patientName, String checkInDay, String checkOutDay, String reason) {
        this.medicalRecordNumber = medicalRecordNumber;
        this.medicalRecordCode = medicalRecordCode;
        this.patientName = patientName;
        this.checkInDay = checkInDay;
        this.checkOutDay = checkOutDay;
        this.reason = reason;
    }

    public int getMedicalRecordNumber() {
        return medicalRecordNumber;
    }

    public void setMedicalRecordNumber(int medicalRecordNumber) {
        this.medicalRecordNumber = medicalRecordNumber;
    }

    public String getMedicalRecordCode() {
        return medicalRecordCode;
    }

    public void setMedicalRecordCode(String medicalRecordCode) {
        this.medicalRecordCode = medicalRecordCode;
    }

    public String getPatientName() {
        return patientName;
    }

    public void setPatientName(String patientName) {
        this.patientName = patientName;
    }

    public String getCheckInDay() {
        return checkInDay;
    }

    public void setCheckInDay(String checkInDay) {
        this.checkInDay = checkInDay;
    }

    public String getCheckOutDay() {
        return checkOutDay;
    }

    public void setCheckOutDay(String checkOutDay) {
        this.checkOutDay = checkOutDay;
    }

    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }

    @Override
    public String toString() {
        return "MEDICAL RECORD NUMBER=" + medicalRecordNumber +
                ", MEDICAL RECORD CODE='" + medicalRecordCode + '\'' +
                ", PATIENT NAME='" + patientName + '\'' +
                ", CHECK IN DAY='" + checkInDay + '\'' +
                ", CHECK OUT DAY='" + checkOutDay + '\'' +
                ", REASON='" + reason;
    }

    public String makeText() {
        return  medicalRecordNumber +
                "," + medicalRecordCode +
                "," + patientName +
                "," + checkInDay +
                "," + checkOutDay +
                "," + reason;
    }
}
