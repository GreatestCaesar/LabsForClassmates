package Main;

import Cipher.Encryption;
import Eng.SteamEngine;
import Ship.Shipyard;
import Ves.SteamVessel;
import Abstr.Vessel;

public class Main {
    public static void main(String[] args) {
        SteamEngine se = new SteamEngine("Быстроходный", 1974, 1500, 23);
        SteamVessel sv = new SteamVessel("Веселый", 1976, 140, 100,2);
        Shipyard s = new Shipyard("Пароходный завод имени Андрея Валерьевича",1850,5203,9);

        System.out.println(se);
        System.out.println();
        System.out.println(sv);
        System.out.println();
        System.out.println(s);
        System.out.println();
        se.on_off(2);
        se.update();
        System.out.println(se.service());
        System.out.println();
        System.out.println("Наследуемый и переопределенный методе: \n" + s.service());
        s.river("Волга"); // через объектную переменную наследника обращаемся к родителю
        System.out.println();
        s.ves();
        s.update();
        Encryption e = new Encryption();
        e.enc();
    }
}
