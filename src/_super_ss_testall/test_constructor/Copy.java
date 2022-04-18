package _super_ss_testall.test_constructor;

class Copy{
    int id;
    String name;

    // Constructor with 2 parameters
    Copy(int i, String n){
        id = i;
        name = n;
    }

    // Constructor
    Copy(Copy s){
        id = s.id;
        name = s.name;
    }

    // Method
    void display(){
        System.out.println(id + " " + name);
    }

    public static void main(String[] args){

        // object declare
        Copy s1 = new Copy(121, "NIT");
        Copy s2 = new Copy(s1);

        // calling method
        s1.display();
        s2.display();
    }
}