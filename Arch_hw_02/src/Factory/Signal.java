package Factory;

import java.time.LocalDateTime;

public abstract class Signal {
    //Какие то обычные поля, которые свойственны всем сигналам
    protected Boolean bad;
    protected LocalDateTime timeSignal;
    protected Boolean activeSignal;

    //Абстрактрый метод, для того, чтобы можно было писать в любом типе уже в их поля.
    public abstract void setSignalValue(Object o);
}
