package _super_ss_testall.test_constructor;

class Copy {
        public static void main(String[] args) {
            System.out.println((int)' ');
        }
//    public static void main(String[] args) {
//        int i = 010;
//        System.out.println(i);
//    }

//    public static void main(String[] args) {
//        byte a = 3;
//        byte b = 4;
//        byte c = (byte)(b - a);
//        System.out.println(c);
//    }



    private String a;
    private String b;
    private String c;
    private String d;
    private String e;

    public Copy() {
        this("abc", "b", "c", "d", "e");
    }

    public Copy(String a, String b, String c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public Copy(String a, String b, String c, String d, String e) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
    }
}