package access_modifier_static_method_static_property.thuc_hanh.bai_tap.access_modifier;

public class Circle {
    private double radius = 1.0;
    private String color = "red";
    private double area = Math.PI * (radius * radius);
    public Circle() {

    }
    public Circle(double radius) {
        this.radius = radius;
    }
    public double getRadius() {
        return radius;
    }
    public double getArea() {
        return area;
    }
}
