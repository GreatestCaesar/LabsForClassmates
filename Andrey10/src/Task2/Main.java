package Task2;

public class Main {
    public static void main(String[] args) {
        Cattle c = new Cattle(250, 2.5);
        System.out.println(c);
        c.update();
        c.red();
        System.out.println(c.check(true));
        System.out.println("^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^");
        DaityPlant d = new DaityPlant("Милка", "Куницкий", 2);
        System.out.println(d);
        d.update();
        d.close();
        System.out.println(d.check(false));
        System.out.println("^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^");
        Curd p = new Curd("Мила", 2.5, 45, 2);
        System.out.println(p);
        p.numb();
        p.milk();
        System.out.println("^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^");
    }
}
