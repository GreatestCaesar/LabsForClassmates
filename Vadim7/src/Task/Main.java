package Task;

public class Main {
    public static void main(String[] args){
        AcousticSystem acousticSystem = new AcousticSystem("HardBass",25,7,1000);
        System.out.println(acousticSystem);
        acousticSystem.vol();
        acousticSystem.equalaizer(2);
        System.out.println(acousticSystem.tools());
        System.out.println(acousticSystem.blue("on"));
        acousticSystem.vol(20);
        acousticSystem.tools("Пианино","Электрогитара","Барабаны");
        System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@");
        Turntable turntable = new Turntable("Сталин",300,"Чёрный",120);
        System.out.println(turntable);
        System.out.println(turntable.speak());
        turntable.speed(2);
        turntable.spine();
        System.out.println(turntable.mode());
        System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@");
        Projector projector = new Projector("SL-2022",2.5,2,2000);
        System.out.println(projector);
        projector.lang("Испанский");
        projector.mode(1);
        projector.addbright();
        System.out.println(projector.port());
        projector.mode("Нормальный");
        projector.lang("Китайский","Японский","Французский","Хинди","Немецкий");
        System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@");
    }
}
