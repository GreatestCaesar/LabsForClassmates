package Main;

public class Main {
    public static void main(String[] args) {
        Cattle.Cattle c = new Cattle.Cattle(250, 2.5);
        System.out.println(c);
        c.update();
        c.red();
        System.out.println(c.check(true));
        System.out.println("^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^");
        DaityPlant.DaityPlant d = new DaityPlant.DaityPlant("Милка", "Куницкий", 2);
        System.out.println(d);
        d.update();
        d.close();
        System.out.println(d.check(false));
        System.out.println("^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^");
        Curd.Curd p = new Curd.Curd("Мила", 2.5, 45, 2);
        System.out.println(p);
        p.numb();
        p.milk();
        System.out.println("^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^");
    }
}
