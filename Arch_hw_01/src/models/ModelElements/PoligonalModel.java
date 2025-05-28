package models.ModelElements;

import java.util.ArrayList;
import java.util.List;

public class PoligonalModel {
    //Fields
    List<Poligon> poligons;

    List<Texture> textures = new ArrayList<>();
    //Constructors
    public PoligonalModel(List<Poligon> poligons) {
        this.poligons = poligons;
    }
    public PoligonalModel(List<Poligon> poligons, List<Texture> textures) {
        this.poligons = poligons;
        this.textures = textures;
    }
}
