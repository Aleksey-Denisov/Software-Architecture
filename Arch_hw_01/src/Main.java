import models.InMemoryModel.ModelStore;
import models.InMemoryModel.Observer1;
import models.ModelElements.*;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        //Начинаю собирать тестовую модель, начну с инициализации полигональной модели
        PoligonalModel poligonalModel = new PoligonalModel(new ArrayList<>(List.of(
                new Poligon(new ArrayList<>(List.of(new Point3D(3,5,7)))))));
        List<PoligonalModel> poligonalModels = new ArrayList<>(List.of(poligonalModel));
        //Затем нужно собрать камеру
        Camera camera = new Camera(new Point3D(8,5,9), new Angle3D());
        //Подготовлю сцены
        List<Scene> scenes = new ArrayList<>(List.of(new Scene(poligonalModels, new ArrayList<>(List.of(camera)))));
        //Для теста запишу идентификатор
        scenes.forEach(scene -> {scene.setId(1);});
        //Свет
        List<Flash> flashes = new ArrayList<>(List.of(new Flash()));
        //Камеры
        List<Camera> cameras = new ArrayList<>(List.of(camera));

        //Передаем все собранное в модельную
        ModelStore store = new ModelStore(poligonalModels, scenes, flashes, cameras);
        //Повесим надлюдателя и зарегистрирую его
        Observer1 observer1 = new Observer1();
        store.RegisterModelChanger(observer1);
        //Нужно проверить работает ли он
        store.addModel(new PoligonalModel(List.of(new Poligon(List.of(new Point3D(6,0,-2))))));
        //Удалю и посмотрю что будет без него
        store.RemoveModelChanger(observer1);
        store.addModel(new PoligonalModel(List.of(new Poligon(List.of(new Point3D(8,2,1))))));

        //Ну и получим сцену,а из сцены координаты камеры например
        Scene scene = store.getScenes(1);
        scene.getCameras().forEach(camera1 -> {
            System.out.println(camera1.getLocation().toString());
        });

    }
}