package _super_ss_testall.test_static;

public class TestNoneStatic {
        int count = 0;

        public TestNoneStatic() {

        }

        public void visit() {
            count++;
            this.print();
        }

        public void print() {
            System.out.println("count = " + count);
        }

        public static void main(String[] args) {
            TestNoneStatic c1 = new TestNoneStatic();
            c1.visit();
            TestNoneStatic c2 = new TestNoneStatic();
            c2.visit();
            TestNoneStatic c3 = new TestNoneStatic();
            c3.visit();
        }
//RESULT: 1 , 1, 1
}


//public class TestStatic {
//    int count = 0;
//
//    public TestStatic() {
//
//    }
//
//    public void visit() {
//        count++;
//        this.print();
//    }
//
//    public void print() {
//        System.out.println("count = " + count);
//    }
//
//    public static void main(String[] args) {
//        TestStatic c1 = new TestStatic();
//        c1.visit();
//        TestStatic c2 = new TestStatic();
//        c2.visit();
//        TestStatic c3 = new TestStatic();
//        c3.visit();
//    }
//RESULT: 1 , 2, 3
//}