package Lab;

import java.util.Scanner;

public class Electricity {
    private String name; // поля
    private String group;
    private String qualification;
    private int raiting;

    Scanner scan = new Scanner(System.in);

    Electricity(){ // конструктор без параметров
        this.name = "";
        this.group = "";
        this.raiting = 0;
        this.qualification = "Не квалифицирован";
    }

    Electricity(String name, String group, String qualification, int raiting){ // конструктор с параметрами
        this.name = name;
        this.group = group;
        this.qualification = qualification;
        this.raiting = raiting;
    }

    public void setName(String name){ this.name = name; }

    public String getName(){ return this.name; }

    public void setGroup(String group){ this.group = group; }

    public String getGroup(){ return  this.group; }

    public void setQualification(String qualification){ this.qualification = qualification; }

    public String getQualification(){ return  this.qualification; }

    public void setRaiting(int raiting){ this.raiting = raiting; }

    public int getRaiting(){ return this.raiting; }

    public void test() { // метод тест
        int ans = 0;
        int[] rait = new int[5]; // массив для ведения отметок
        if (getName() == "") {
            System.out.print("Введите ваше имя: ");
            this.name = scan.nextLine();
        }
        if (getGroup() == "") {
            System.out.print("Введите бригаду: ");
            this.group = scan.nextLine();
        }

        System.out.print("Вопрос №1: Какого порогового значения силы тока не существует:\n1. 0.4 ... 1.5 (мА)\n2. 90 ... 100 (мА)\n3. 0.1 ... 0.3 (мА)\n----\n");
        ans = scan.nextInt();
        System.out.print("----\n\n");
        if(ans==3){
            rait[0] = 0;
        }else{
            rait[0] = 1;
        }

        System.out.print("Вопрос №2: Наиболее опасный путь прохождения тока:\n1. Рука - Рука\n2. Ухо - Нос\n3. Губа - Хвост\n----\n");
        ans = scan.nextInt();
        System.out.print("----\n\n");
        if(ans==1){
            rait[1] = 1;
        }else{
            rait[1] = 0;
        }

        System.out.print("Вопрос №3: Наиболее опасная продолжительность действия тока\n1. 10 сек\n2. 1 сек\n3. 5 сек\n----\n");
        ans = scan.nextInt();
        System.out.print("----\n\n");
        if(ans==2){
            rait[2] = 1;
        }else{
            rait[2] = 0;
        }

        System.out.print("Вопрос №4: Какое из требований к персоналу, обслуживающему электроустановки, правдивое?\n1. Лица не моложе 18 лет\n2. Прошедшие мед. осмотр\n3. Прошедшие соответствующий инструктаж и имеющие квалификационную группу не нижу третьей\n4. Обученные безопасным методам труда и сдавшим экзамен\n5. Все ложь\n6. Все правда\n----\n");
        ans = scan.nextInt();
        System.out.print("----\n\n");
        if(ans==6){
            rait[3] = 1;
        }else{
            rait[3] = 0;
        }

        System.out.print("Вопрос №5: К ручному электроинструменту относят?\n1. Чемоданчик\n2. Светильник\n3. Ручные электрические машины\n----\n");
        ans = scan.nextInt();
        System.out.print("----\n\n");
        if(ans==1){
            rait[4] = 0;
        }else{
            rait[4] = 1;
        }

        System.out.print(getName()+" ваша оценка составляет: "+rait(rait)+". Бригада: " + getGroup() + "\n");
    }

    public String rait(int[] r) { // подсчёт итогового балла
        int sum = 0;
        String s="";
        for (int i = 0; i < 5; i++) {
            sum += r[i];
        }

        if(sum == 0){
            s = "0 - это увольнение";
            setRaiting(0);
        }else if(sum == 1){
            s = "1 - тест не сдан";
            setRaiting(1);
        }else if(sum == 2){
            s = "2 - тест не сдан";
            setRaiting(2);
        }else if(sum == 3){
            s = "3 - еще есть недочёты";
            setRaiting(3);
        }else if(sum == 4){
            s = "4 - отлично";
            setRaiting(4);
        }else if(sum == 5){
            s = "5 - идеально";
            setRaiting(5);
        }
        return s;
    }

    public void game(){ // игра
        int n;
        int k = 0;
        if (getName() == "") {
            System.out.print("Введите ваше имя: ");
            this.name = scan.nextLine();
        }
        if (getGroup() == "") {
            System.out.print("Введите бригаду: ");
            this.group = scan.nextLine();
        }

        System.out.print(getName()+" сыграем в игру?. Не бойся, это не очередная часть пилы, проверим твои знания в работе!\n1. Да, мне нечего бояться!\t2. Пожалуй, откажусь\n");
        n = scan.nextInt();
        if(n==1){
            k++;
            ObtainingQualification(k);
            System.out.print("На участке в деревне Орехово пропало электричество, вероятнее всего обрыв электропередач, инструмент который возьму с собой:\n1. Катриджи Человека-Паука\t2. Зацепы (Кошка)\n");
            n = scan.nextInt();
            if(n==2){
                k++;
                ObtainingQualification(k);
                System.out.print("Провод оказался оборван и висит на дереве не касаясь земли:\n1. Подойду потрогаю, не на земле же, значит не опасно!\t2. Дождусь отключения сети на станции электропедерач!\t3. Ашчушчэнне, што усё гэта зрабiлi клятыя Паляки\n");
                n = scan.nextInt();
                if(n == 2){
                    k++;
                    ObtainingQualification(k);
                    System.out.print("Поздравляем! Игра пройдена) Узнать квалификацию можно в Меню\n");
                }else{
                    System.out.print("До свидания!\n");
                }
            }else{
                System.out.print("Понаберут по объявленияю!!! До свидания!\n");
            }
        }else{
            System.out.print("До свидания!\n");
        }
    }

    public void ObtainingQualification(int k){
        if(k == 1){
            setQualification("Новичок");
        }else if(k == 2){
            setQualification("Специалист");
        }else if(k == 3){
            setQualification("Профессионал");
        }else{
            setQualification("Не квалифицирован");
        }
    }

    public void Show(){
        System.out.print("----------------------------\n" +
                         "| Имя                  | " + getName() + "\n----------------------------\n");
        System.out.print("| Бригада              | " + getGroup() + "\n----------------------------\n");
        System.out.print("| Рейтинг теста        | " + getRaiting() + "\n----------------------------\n");
        System.out.print("| Квалификация         | " + getQualification() + "\n----------------------------\n");
    }

    public void Duties(int n){
        if(n == 0){
            System.out.println("На данный момент у вас нет никаких обязанностей");
        }else if(n == 1){
            System.out.println("Вы не так хорошо обучены, для вас нет никакой работы");
        }else if(n == 2){
            System.out.println("Можете провести инвентаризацию и вытереть пыль");
        }else if(n == 3){
            System.out.println("Составьте планы на месяц для проведения работ");
        }else if(n == 4){
            System.out.println("Проверьте своё оборудование для работы и перечитайте регламенты, для освежения памяти");
        }else if(n == 5){
            System.out.println("С данной отметкой, делайте что захотите");
        }
    }

    public void Duties(String s){
        if(s.equals("Новичок")){
            System.out.println("Можете провести инвентаризацию и вытереть пыль");
        }else if(s.equals("Специалист")){
            System.out.println("Составьте планы на месяц для проведения работ");
        }else if(s.equals("Профессионал")){
            System.out.println("Проверьте своё оборудование для работы и перечитайте регламенты, для освежения памяти");
        }else if(s.equals("Не квалифицирован")){
            System.out.println("На данный момент у вас нет никаких обязанностей");
        }
    }

    public String toString(String n, String g){
        return "\n" + n + "\nБригада: " + g;
    }

    public String toString(String n, int r){
        return "\n" + n + "\nРейтинг: " + r;
    }
}
