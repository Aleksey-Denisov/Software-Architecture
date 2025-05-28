package models.InMemoryModel;

public interface IModalChanger {
    public void NotifyChange();

    public void RegisterModelChanger(IModelChangedObserver observer);

    public void RemoveModelChanger(IModelChangedObserver observer);
}