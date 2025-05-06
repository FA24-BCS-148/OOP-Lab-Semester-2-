import java.util.Objects;

public class Cube extends Shape_3D{
    private double side;

    public Cube(String name, double side) {
        super(name);
        this.side = side;
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }

    @Override
    public double volume() {
        return side*side*side;
    }

    @Override
    public double area() {
        return 6*side;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Cube cube = (Cube) o;
        return Double.compare(cube.side, side) == 0;
    }
}
