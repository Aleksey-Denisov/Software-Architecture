package Factory;

import java.time.LocalDateTime;

public class BoolSignal extends Signal{
    private Boolean signalValue;

    public BoolSignal() {
        bad = true;
        activeSignal = false;
        timeSignal = LocalDateTime.now();
    }

    @Override
    public void setSignalValue(Object o) {
        this.signalValue = (Boolean) o;
    }

    @Override
    public String toString() {
        return "Этот сигнал имеет значение : " + signalValue +
                "\nНедостоверность сигнала: " + bad + ", время последней записи: " + timeSignal.toString() +
                "\nи активностью сигнала: " + activeSignal;
    }
}
