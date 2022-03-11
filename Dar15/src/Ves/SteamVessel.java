package Ves;

import Abstr.Vessel;
import Eng.SteamEngine;

public class SteamVessel extends Thread {
    private int mindepth; // минимальная глубина реки, необходимая для работы парохода
    SteamVessel s;

    public SteamVessel() {
        mindepth = 0;
    }

    public SteamVessel(int mindepth) {
        this.mindepth = mindepth;
    }

    public SteamVessel(SteamVessel s) {
        super("Поток");
        this.s = s;
        start();
    }

    public int getMindepth() {
        return mindepth;
    }

    public void setMindepth(int mindepth) {
        this.mindepth = mindepth;
    }

    public void run(){
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(s);
        System.out.println(s.service());
        s.river("Днепр");

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    @Override
    public String toString() {
        return "Пароход{" +
                ", минимальная глубина реки=" + mindepth +
                '}';
    }

    public String service() {
        return "Пароход проходил последнее обслуживание 27.03.2020";
    }

    public void river(String riv) {
        System.out.println("Река, по котороый пароход осуществляет своё плавание: " + riv);
    }
}
