import java.util.Objects;

public class Sphere extends Shape_3D{
    private double radius;

    public Sphere(String name, double radius) {
        super(name);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public double volume() {
        return ((4/3)*3.14*radius*radius*radius);
    }

    @Override
    public double area() {
        return (4*3.14*radius*radius);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Sphere sphere = (Sphere) o;
        return Double.compare(sphere.radius, radius) == 0;
    }
}
