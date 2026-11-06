public class WorkingTime implements Visitor {
    @Override
    public void visit(Phone phone) {
        System.out.println("Time to discharge: " + (phone.battery * 5) + " minutes");
    }

    @Override
    public void visit(Laptop laptop) {
        System.out.println("Time to discharge: " + (laptop.battery * 2) + " minutes");
    }
}