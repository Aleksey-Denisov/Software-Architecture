package models.ModelElements;

public class Point3D {
    //Fields
    private double x;
    private double y;
    private double z;

    //Simple constructor
    public Point3D(double x, double y, double z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    //Getters and Setters
    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    public double getZ() {
        return z;
    }

    public void setZ(double z) {
        this.z = z;
    }

    @Override
    public String toString() {
        return "Координаты объекта: Х: " + x + " Y: " + y + " Z: " + z;
    }
}
