package Ves;

import Abstr.Vessel;

public class SteamVessel extends Vessel {
    private int mindepth; // минимальная глубина реки, необходимая для работы парохода

    public SteamVessel() {
        super();
        mindepth = 0;
    }

    public SteamVessel(String name, int year, int place, double way, int mindepth) {
        super(name, year, place, way);
        this.mindepth = mindepth;
    }

    public int getMindepth() {
        return mindepth;
    }

    public void setMindepth(int mindepth) {
        this.mindepth = mindepth;
    }

    @Override
    public String toString() {
        return "Пароход{" +
                "название='" + super.getName() + '\'' +
                ", год=" + super.getYear() +
                ", кол-во мест=" + super.getPlace() +
                ", запас хода=" + super.getWay() +
                ", минимальная глубина реки=" + mindepth +
                '}';
    }

    @Override
    public String service() {
        return "Пароход проходил последнее обслуживание 27.03.2020";
    }

    @Override
    public void river(String riv) {
        System.out.println("Река, по котороый пароход осуществляет своё плавание: " + riv);
    }
}
