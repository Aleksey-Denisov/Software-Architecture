package Factory;

public class SignalFactory {
    public Signal getSignal(TypeSignals type){
        return switch (type) {
            case BOOL -> new BoolSignal();
            case STRING -> new StringSignal();
            case INT -> new IntSignal();
        };
    }
}
