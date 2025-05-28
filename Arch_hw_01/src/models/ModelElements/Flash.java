package models.ModelElements;

public class Flash {
    //Fields
    private Point3D Location;
    private Angle3D Angle;
    private Color Color;
    private Float Power;

    //Constructor
    public Flash(Point3D location, Angle3D angle, models.ModelElements.Color color, Float power) {
        Location = location;
        Angle = angle;
        Color = color;
        Power = power;
    }

    public Flash() {
    }
    //Methods
    public void Rotate(Angle3D angle) {
        Angle = angle;
    }

    public void Move(Point3D point3D) {
        Location = point3D;
    }
}
