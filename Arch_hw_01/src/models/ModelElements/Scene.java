package models.ModelElements;

import java.util.ArrayList;
import java.util.List;

public class Scene {
    //Fields
    private int Id;
    private List<PoligonalModel> Models;
    private List<Flash> Flashes = new ArrayList<>();
    private List<Camera> Cameras;

    public Scene(List<PoligonalModel> models, List<Camera> cameras) {
        if(models.isEmpty() || cameras.isEmpty())
            throw new RuntimeException("Параметры для сцены не должны быть пустыми");
        Models = models;
        Cameras = cameras;
    }

    //Getters and setters
    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }

    public List<PoligonalModel> getModels() {
        return Models;
    }

    public void setModels(List<PoligonalModel> models) {
        if(models.isEmpty())
            throw new RuntimeException("Полигоны не могут быть пустыми");
        Models = models;
    }

    public List<Flash> getFlashes() {
        return Flashes;
    }

    public void setFlashes(List<Flash> flashes) {
        Flashes = flashes;
    }

    public List<Camera> getCameras() {
        return Cameras;
    }

    public void setCameras(List<Camera> cameras) {
        if(cameras.isEmpty())
            throw new RuntimeException("Камеры не могут отсутствовать");
        Cameras = cameras;
    }
}
