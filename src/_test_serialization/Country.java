package _test_serialization;


import java.io.Serializable;

public class Country implements Serializable {
    private static final long serialVersionUID = 9L;
    private int id;
//    Ngăn ko serialization thuộc tính khai báo tránient
    private transient String code;
    private String Name;

//    has a
    private Capital capital;


    public Country(int i) {
    }

    public Country(int id, String code, String name, Capital capital) {
        this.id = id;
        this.code = code;
        Name = name;
        this.capital = capital;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    @Override
    public String toString() {
        return "Country: " +
                "id= " + id +
                ", code= " + code +
                ", Name= " + Name +
                "Capital: " + capital.getName();
    }
}
