package Adapter;

public class Client {
    //Какое то поле для хранения информации
    private String data;

    //Функция получения информации
    public void getDataStorage(IDataStorage storage) {

        data = storage.getData();
    }
    //Простой геттер
    public String getData() {
        return data;
    }

}
