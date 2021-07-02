package classes_and_objects_in_java.thuc_hanh.thuc_hanh.rectangular;

public class Rectangular {
    double width, height;
    public Rectangular(){

    }
    public Rectangular(double width, double height) {
        this.width = width;
        this.height = height;
    }
    public double getArea() {
        return this.width * this.height;
    }

    public double getPerimeter() {
        return (this.width + this.height) * 2;
    }

    public String display() {
        return "Rectangle{" + "width=" + width + ", height=" + height + "}";
    }
}
