public class Main {
    public static void main(String[] args) {
        Phone phone = new Phone(50);
        Laptop laptop = new Laptop(80);

        Visitor workingTime = new WorkingTime();

        System.out.println("Calculating working time:");
        phone.accept(workingTime);
        laptop.accept(workingTime);

        phone.apps.put("WhatsApp", true);
        phone.apps.put("TikTok", false);
        phone.apps.put("Facebook", false);
        laptop.apps.put("Chrome", true);
        laptop.apps.put("Unity", false);
        laptop.apps.put("VS Code", true);

        Visitor closeEverything = new CloseEverything();
        System.out.println("\nClosing all apps:");
        phone.accept(closeEverything);
        laptop.accept(closeEverything);
    }
}