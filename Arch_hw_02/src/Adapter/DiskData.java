package Adapter;

public class DiskData implements IDataStorage{
    //Поле класса, который мы хотим адаптировать
    private final Disk disk;
    //Простой конструктор
    public DiskData() {
        this.disk = new Disk();
    }
    //Переопределение метода интерфейса
    @Override
    public String getData() {
        return disk.getDiskData();
    }
}
