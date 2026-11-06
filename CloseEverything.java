import java.util.Map;

public class CloseEverything implements Visitor {
    @Override
    public void visit(Phone phone) {
        for (Map.Entry<String, Boolean> app : phone.apps.entrySet()) {
            if (app.getValue()) {
                System.out.println("Closing app " + app.getKey() + " on phone");
                app.setValue(false);
            }
        }
    }

    @Override
    public void visit(Laptop laptop) {
        for (Map.Entry<String, Boolean> app : laptop.apps.entrySet()) {
            if (app.getValue()) {
                System.out.println("Closing app " + app.getKey() + " on laptop");
                app.setValue(false);
            }
        }
    }
}