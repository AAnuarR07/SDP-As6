import java.util.HashMap;
import java.util.Map;

public class Laptop implements Element {
    int battery;
    Map<String, Boolean> apps = new HashMap<>();

    Laptop(int battery) {
        if (battery < 0 || battery > 100) {
            throw new IllegalArgumentException("Battery must be between 0 and 100");
        } else {
            this.battery = battery;
        }
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}