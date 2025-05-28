package models.ModelElements;

public class Camera {
    //Fields
    private Point3D Location;
    private Angle3D Angle;
    //Constructor
    public Camera(Point3D location, Angle3D angle) {
        Location = location;
        Angle = angle;
    }
    //Methods
    public void Rotate(Angle3D angle) {
        Angle = angle;
    }

    public void Move(Point3D point3D) {
        Location = point3D;
    }

    public Point3D getLocation() {
        return Location;
    }
}
