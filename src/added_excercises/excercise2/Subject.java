package added_excercises.excercise2;

public class Subject implements Comparable<Subject> {
    private String subjectCode;
    private String subjectName;
    private String version;
    private String level;
    private int studyHour;

    public Subject(String subjectCode, String subjectName, String version, String level, int studyHour) {
        this.subjectCode = subjectCode;
        this.subjectName = subjectName;
        this.version = version;
        this.level = level;
        this.studyHour = studyHour;
    }

    public String getSubjectCode() {
        return subjectCode;
    }

    public void setSubjectCode(String subjectCode) {
        this.subjectCode = subjectCode;
    }

    public String getSubjectName() {
        return subjectName;
    }

    public void setSubjectName(String subjectName) {
        this.subjectName = subjectName;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level;
    }

    public int getStudyHour() {
        return studyHour;
    }

    public void setStudyHour(int studyHour) {
        this.studyHour = studyHour;
    }

    @Override
    public String toString() {
        return "SUBJECT: " +
                "CODE='" + subjectCode  +
                ", NAME='" + subjectName  +
                ", VERSION='" + version  +
                ", LEVEL='" + level +
                ", STUDY TIME=" + studyHour;
    }

    public String makeText() {
        return subjectCode + "," +
                subjectName + "," +
                version + "," +
                level + "," +
                studyHour;
    }

    @Override
    public int compareTo(Subject o) {
        return studyHour - o.studyHour;
    }
}
