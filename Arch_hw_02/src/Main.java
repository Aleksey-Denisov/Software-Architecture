import Adapter.BookData;
import Adapter.Client;
import Adapter.DiskData;
import Factory.Signal;
import Factory.SignalFactory;
import Factory.TypeSignals;

public class Main {
    public static void main(String[] args) {
        //Просто так лучше, когда все в отдельной функции
        workAdapter();
        System.out.println("--------------");
        workFactory();
    }

    private static void workFactory() {
        //Захотелось что-то свое показать от части
        //По этому берем сигналы, они могут быть разных типов
        //Фабрика отличный паттерн, который позволит получать нужный тип
        //Попробуем получить бульку и посмотреть что выдаст
        Signal signal = new SignalFactory().getSignal(TypeSignals.BOOL);
        signal.setSignalValue(true);
        System.out.println(signal);

        signal = new SignalFactory().getSignal(TypeSignals.STRING);
        signal.setSignalValue("Текст для проверки");
        System.out.println(signal);

        signal = new SignalFactory().getSignal(TypeSignals.INT);
        signal.setSignalValue(248);
        System.out.println(signal);
    }

    private static void workAdapter() {
        //Клиент хочет получать информацию откуда угодно
        //Наша задача адаптировать классы с информацией
        //Создаем клиента
        Client client = new Client();
        //Клиент хочет сначала получить данные из книги
        BookData bookData = new BookData();
        //Затем с диска
        DiskData diskData = new DiskData();
        //Передаем клиенту экземпляр книги и получаем данные
        client.getDataStorage(bookData);
        //Выводим в консоль, то что получили
        System.out.println(client.getData());
        //Аналогичные действия сделаем и для диска
        client.getDataStorage(diskData);
        //Так же выведем в консоль
        System.out.println(client.getData());
    }
}