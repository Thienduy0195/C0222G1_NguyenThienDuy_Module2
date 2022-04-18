package _super_ss_testall.test_this;

public class UsingThisExample {

    private int id;

    private String website;

    private String subject;

    public UsingThisExample() {
        this.id = 1;
    }

    public UsingThisExample setWebsite(String website) {
        this.website = website;
        return this;
    }

    public UsingThisExample setSubject(String subject) {
        this.subject = subject;
        return this;
    }

    public void print() {
        System.out.println("Id = " + id);
        this.printWebsite();
        this.printSubject();
    }

    private void printWebsite() {
        System.out.println("Subject = " + subject);
    }

    private void printSubject() {
        System.out.println("Website = " + website);
    }

    public static void main(String[] args) {
        UsingThisExample ex1 = new UsingThisExample()
                .setSubject("OOP")
                .setWebsite("gpcoder.com");
        ex1.print();
    }

}