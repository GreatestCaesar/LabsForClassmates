package Task;

public class Main {
    public static void main(String[] args) {
        Cattle c = new Cattle(250, 2.5);
        System.out.println(c);
        c.update();
        c.red();
        System.out.println("^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^");
        DaityPlant d = new DaityPlant("Милка", "Куницкий", 2);
        System.out.println(d);
        d.update();
        d.close();
        System.out.println("^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^");
        Product p = new Product("Сыр", 2.5, 45);
        System.out.println(p);
        p.numb();
        System.out.println("^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^");
    }
}
