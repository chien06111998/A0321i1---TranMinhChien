package classes_and_objects_in_java.thuc_hanh.bai_tap.quadratic_equation;

public class QuadraticEquation {
    int a,b,c;
    QuadraticEquation() {

    }
    QuadraticEquation(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    public int getA() {
        return a;
    }

    public int getB() {
        return b;
    }

    public int getC() {
        return c;
    }
    public int getDiscriminant() {
        int delta = b*b - (4 * a * c);
        return delta;
    }
}
