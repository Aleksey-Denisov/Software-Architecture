package models.InMemoryModel;

public class Observer1 implements IModelChangedObserver{
    @Override
    public void ApplyUpdateModel() {
        System.out.println("Add item in Model Store");
    }
}
