package models.InMemoryModel;

import models.ModelElements.Camera;
import models.ModelElements.Flash;
import models.ModelElements.PoligonalModel;
import models.ModelElements.Scene;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;

public class ModelStore implements IModalChanger{
    //Fields
    private List<PoligonalModel> Models;
    private List<Scene> Scenes;

    private List<Flash> Flashes;

    private List<Camera> Cameras;

    private List<IModelChangedObserver> changeObservers = new ArrayList<>();

    //Constructor
    public ModelStore(List<PoligonalModel> models, List<Scene> scenes, List<Flash> flashes, List<Camera> cameras) {
        if(models.isEmpty() || scenes.isEmpty() || flashes.isEmpty() || cameras.isEmpty())
            throw new RuntimeException("Параметры не могут быть пустыми");
        Models = models;
        Scenes = scenes;
        Flashes = flashes;
        Cameras = cameras;
    }

    //Methods
    public Scene getScenes(int id) {

        for(Scene scene : Scenes) {
            if (scene.getId() == id)
                return scene;
        }
        return null;
    }

    public void addModel(PoligonalModel model) {
        Models.add(model);
        NotifyChange();
    }
    @Override
    public void NotifyChange() {
        changeObservers.forEach(IModelChangedObserver::ApplyUpdateModel);
    }

    @Override
    public void RegisterModelChanger(IModelChangedObserver observer) {
        changeObservers.add(observer);
    }

    @Override
    public void RemoveModelChanger(IModelChangedObserver observer) {
        changeObservers.remove(observer);
    }
}