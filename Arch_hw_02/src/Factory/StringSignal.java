package Factory;

import java.time.LocalDateTime;

public class StringSignal extends Signal{
    private String signalValue;

    public StringSignal() {
        bad = false;
        activeSignal = true;
        timeSignal = LocalDateTime.now();
    }

    @Override
    public void setSignalValue(Object o) {
        this.signalValue = (String) o;
    }

    @Override
    public String toString() {
        return "Этот сигнал имеет значение : " + signalValue +
                "\nНедостоверность сигнала: " + bad + ", время последней записи: " + timeSignal.toString() +
                "\nи активностью сигнала: " + activeSignal;
    }
}
