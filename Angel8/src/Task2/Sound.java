package Task2;

import java.util.ArrayList;
import java.util.Scanner;

public class Sound {
    private String name; // название
    private String executor; // исполнитель
    private String style; // стиль
    private double duration; // длительность
    private int num; // место в чарте

    public Sound() {
        name = "";
        executor = "";
        style = "";
        duration = 0;
        num = 0;
    }

    public Sound(String name, String executor, String style, double duration, int num) {
        this.name = name;
        this.executor = executor;
        this.style = style;
        this.duration = duration;
        this.num = num;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getExecutor() {
        return executor;
    }

    public void setExecutor(String executor) {
        this.executor = executor;
    }

    public String getStyle() {
        return style;
    }

    public void setStyle(String style) {
        this.style = style;
    }

    public double getDuration() {
        return duration;
    }

    public void setDuration(double duration) {
        this.duration = duration;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public ArrayList<Sound> creat(ArrayList<Sound> sounds){
        Scanner scanner = new Scanner(System.in);
        Composition c = new Composition();
        System.out.print("Введите название трека: ");
        c.setName(scanner.nextLine());
        System.out.print("Введите имя исполнителя: ");
        c.setExecutor(scanner.nextLine());
        System.out.print("Введите стиль: ");
        c.setStyle(scanner.nextLine());
        System.out.print("Введите длительность трек: ");
        c.setDuration(scanner.nextDouble());
        System.out.print("Введите место в чарте: ");
        c.setNum(scanner.nextInt());
        sounds.add(c);
        return sounds;
    }

    public ArrayList<Sound> sort(ArrayList<Sound> sounds){
        Composition c = new Composition();
        Scanner scanner = new Scanner(System.in);
        String str;
        System.out.println("Введите стиль, относительно которого хотите сделать выборку: ");
        str = scanner.nextLine();
        for(int i=0;i<sounds.size();i++){
            for(int j=i+1;j<sounds.size();j++){
                if(sounds.get(j).getStyle().equals(str)){
                    c  = (Composition) sounds.get(i);
                    sounds.set(i,sounds.get(j));
                    sounds.set(j,c);
                }
            }
        }
        return sounds;
    }

    @Override
    public String toString() {
        return "Трек{" +
                "название='" + name + '\'' +
                ", исполнитель='" + executor + '\'' +
                ", стиль='" + style + '\'' +
                ", длительность=" + duration +
                ", место в чарте=" + num +
                '}';
    }
}
