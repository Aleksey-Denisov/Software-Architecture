package Adapter;

public class BookData implements IDataStorage{
    //Поле класса, который мы хотим адаптировать
    private final Book book;
    //Простой конструктор
    public BookData() {
        this.book = new Book();
    }
    //Переопределение метода интерфейса
    @Override
    public String getData() {
        return book.getBookData();
    }
}
