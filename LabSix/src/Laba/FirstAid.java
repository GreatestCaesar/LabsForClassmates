package Laba;

import java.util.Date;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class FirstAid {
    String category;
    String name;
    String name1;
    int age;
    int degree;

    FirstAid(){
        this.category = "";
        this.name = "";
        this.age = 0;
        this.degree = 0;
        this.name1 = "";
    }

    FirstAid(String category, String name, int age, int degree, String name1){
        this.category = category;
        this.name = name;
        this.age = age;
        this.degree = degree;
        this.name1 = name1;
    }

    public void Category_Definition() throws InterruptedException {
        Scanner s = new Scanner(System.in);
        int n;
        System.out.print("Вы\n1. Пострадавший\t\t2. Оказываю помощь\n");
        n = s.nextInt();
        if(n == 1) {
            this.category = "Пострадавший";
            Victim();
        }else if(n == 2){
            this.category = "Помощник";
            Assistant();
        }
    }

    public void Victim() throws InterruptedException {
        Scanner s = new Scanner(System.in);
        System.err.print("Не предпринимайте никаких действий по оказанию помощи самому себе, вы можете ухудшить ситуацию и занести инфекцию!\n");
        System.err.print("Укажите ваше имя: ");
        this.name = s.nextLine();
        System.err.print("Укажите ваш возраст: ");
        this.age = s.nextInt();
        System.err.print("Укажите степень ожога: \n");
        System.out.print("Краткие сведения об ожогах:\n1ая степень - ОТЕКИ, ПОКРАСНЕНИЕ, БОЛЬ\n2ая степень - частичное повреждение эпидермиса и дермы\n3я степень - полное омертвление эпидермиса и дермы, отсутсвие кровоснабжения\n4ая степень - обугливание подкожной клетчатки мышц, фасций и костей\n");
        this.degree = s.nextInt();
        TimeUnit.SECONDS.sleep(5);
        System.out.print("Данные отправлены. Ожидайте помощь!\n");
        TimeUnit.SECONDS.sleep(3);
        System.out.print("Вызов 103...\n");
        TimeUnit.SECONDS.sleep(10);
        System.out.print("Помощь уже в пути\n");
    }

    public void Assistant() throws InterruptedException {
        Scanner s = new Scanner(System.in);
        String c = "s";
        System.out.print("Укажите ваше имя: ");
        this.name1 = s.nextLine();
        System.out.print("Укажите имя пострадавшего(Если есть возможность): ");
        this.name = s.nextLine();
        System.out.print("Укажите возраст пострадавшего(Если есть возможность: ");
        this.age = s.nextInt();
        System.out.print("Укажите степень ожога: \n");
        System.out.print("Краткие сведения об ожогах:\n1ая степень - ОТЕКИ, ПОКРАСНЕНИЕ, БОЛЬ\n2ая степень - частичное повреждение эпидермиса и дермы\n3я степень - полное омертвление эпидермиса и дермы, отсутсвие кровоснабжения\n4ая степень - обугливание подкожной клетчатки мышц, фасций и костей\n");
        this.degree = s.nextInt();
        TimeUnit.SECONDS.sleep(5);
        System.out.print("Данные отправлены. Ожидайте помощь!\n");
        TimeUnit.SECONDS.sleep(3);
        System.out.print("Вызов 103...\n");
        TimeUnit.SECONDS.sleep(5);
        System.out.print("Помощь уже в пути!\n");
        System.out.print("Освободите место ожога от одежды! Сделано?(Enter - продолжение)");
        c = s.nextLine();
        s.nextLine();
        System.out.print("Поместить обоженное место под холодную проточную воду на 10-20 мин или приложить холодный компресс! Сделано?(Enter - продолжение)");
        c = s.nextLine();
        System.out.print("Обработать обоженное место антисептиком! Сделано?(Enter - продолжение)");
        c = s.nextLine();
        System.out.print("При интенсивной боли дать пострадавшему обезбаливающее! Сделано?(Enter - продолжение)");
        c = s.nextLine();
        System.out.print("Вы оказали помощь! Ожидайте доктора\n");
    }

    public void Data(){
        System.out.print("╔═════════════════════════╦═══════════\n");
        System.out.print("║ Имя оказывающего помощь ║ " + this.name1 + "\n");
        System.out.print("╠═════════════════════════╬═══════════\n");
        System.out.print("║ Имя пострадавшего       ║ " + this.name + "\n");
        System.out.print("╠═════════════════════════╬═══════════\n");
        System.out.print("║ Возраст пострадавшего   ║ " + this.age + "\n");
        System.out.print("╠═════════════════════════╬═══════════\n");
        System.out.print("║ Степень ожога           ║ " + this.degree + "\n");
        System.out.print("╠═════════════════════════╬═══════════\n");
        System.out.print("║ Время вызова            ║ " + Date() + "\n");
        System.out.print("╚═════════════════════════╩═══════════\n");
    }

    public String Date(){
        Date d = new Date();
        String date = "" + d.getHours() + ":" + d.getMinutes() + ":" + d.getSeconds();
        return date;
    }

    public void setCategory(String category) {this.category = category;}
    public String getCategory() {return this.category;}

    public  void setName(String name) {this.name = name;}
    public  String getName() {return this.name;}

    public void setAge(int age) {this.age = age;}
    public int getAge() {return this.age;}

    public void setDegree(int degree) {this.degree=degree;}
    public int getDegree() {return this.degree;}
}
