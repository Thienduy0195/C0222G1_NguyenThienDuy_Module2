package _04_class_and_object.excercise.quadratic_equation;

public class SolveQuadraticEquation {
    private final double a;
    private final double b;
    private final double c;
//    public SolveQuadraticEquation(){
//
//        }
    public SolveQuadraticEquation(double a, double b, double c){
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double getA() {
        return this.a;
    }
    public double getB() {
        return this.b;
    }
    public double getC() {
        return this.c;
    }
    public double getDiscriminant(){
        return this.b * this.b - 4 * this.a * this.c;
    }
    public double getRoot1(){
        if (getDiscriminant()>=0){
            return ((-this.b + Math.pow(getDiscriminant(),0.5))/(2 *this.a));
        }else{
            return 0.0d;
        }
    }
    public double getRoot2(){
        if (getDiscriminant()>=0){
            return (-this.b - Math.pow(getDiscriminant(),0.5))/2/this.a;
        }else{
            return 0.0d;
        }
    }
    public void resolve(){
        if(getA()==0){
            if (getB()==0){
                System.out.println("The equation has no solution!");
            } else{
                System.out.println("The equation has one solution: " + getC()/getB());
            }
        }
        if (getDiscriminant()>=0){
            System.out.println("The equation has two solutions x1: " + getRoot1() + " and x2: " + getRoot2());
        }else{
            System.out.println("The equation has no solution!");
        }
    }
}
