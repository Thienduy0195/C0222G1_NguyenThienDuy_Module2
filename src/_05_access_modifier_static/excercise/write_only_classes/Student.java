package _05_access_modifier_static.excercise.write_only_classes;

public class Student {
    private String name = "John";
    private String classes = "C02";
    public Student(){

    }

    public String getName() {
        return name;
    }

    public String getClasses() {
        return classes;
    }
//    private void setName(String name) {
//        this.name = name;
//    }
//    private void setClasses(String classes) {
//        this.classes = classes;
//    }
    protected void setName(String name) {
        this.name = name;
    }
    protected void setClasses(String classes) {
        this.classes = classes;
    }
}
