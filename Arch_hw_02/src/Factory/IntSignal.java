package Factory;

import java.time.LocalDateTime;

public class IntSignal extends Signal{
    private Integer signalValue;

    public IntSignal() {
        bad = true;
        activeSignal = true;
        timeSignal = LocalDateTime.now();
    }
    @Override
    public void setSignalValue(Object o) {
        this.signalValue = (Integer) o;
    }
    @Override
    public String toString() {
        return "Этот сигнал имеет значение : " + signalValue +
                "\nНедостоверность сигнала: " + bad + ", время последней записи: " + timeSignal.toString() +
                "\nи активностью сигнала: " + activeSignal;
    }
}
