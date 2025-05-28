package models.ModelElements;

import java.util.ArrayList;
import java.util.List;

public class Poligon {
    //Fields
    List<Point3D> points;
    //Constructors
    public Poligon(List<Point3D> points) {
        if(points.isEmpty())
            throw new RuntimeException("Набор точек не может быть пустым");
        this.points = points;
    }
    //Getter
    public List<Point3D> getPoints() {
        return points;
    }
}
