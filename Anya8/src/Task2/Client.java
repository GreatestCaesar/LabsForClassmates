package Task2;

import Task1.Petal;

import java.util.ArrayList;
import java.util.Scanner;

public class Client {
    private String name; // имя
    private int year; // возраст
    private long id; // идентификтор
    private ArrayList<Score> scores; // счета

    public Client() {
        name = "";
        year = 0;
        id = 0;
        scores = null;
    }

    public Client(String name, int year, int id, ArrayList<Score> scores) {
        this.name = name;
        this.year = year;
        this.id = id;
        this.scores = scores;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public ArrayList<Score> getScores() {
        return scores;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public void setScores(ArrayList<Score> scores) {
        this.scores = scores;
    }

    public ArrayList<Score> open(ArrayList<Score> scores){
        Scanner scan = new Scanner(System.in);
        Score s = new Score();
        s.setId((long)((Math.random()*9999999999999l)+0));
        System.out.println("Введите сумму, которую хотите положить на счёт: ");
        s.setSum(scan.nextDouble());
        s.setPercent(0.003);
        s.setLocked(false);
        scores.add(s);
        setScores(scores);
        System.out.println("Счёт успешно создан. Номер - " + s.getId());
        return scores;
    }

    public ArrayList<Score> block(ArrayList<Score> scores){
        Scanner scan = new Scanner(System.in);
        long r;
        int o = 0;
        boolean l = false;
        String ans = "";
        out(scores);
        do{
            l = false;
            System.out.println("Введите номер счёта, который желаете заблокировать/разблокировать: ");
            r = scan.nextLong();
            for(int i=0;i<scores.size();i++){
                if(scores.get(i).getId()==r){
                    l = true;
                }
            }
            if(l!=true){
                System.out.println("Ошибка, повторите ввод");
            }
        }while (l!=true);

        for(int i=0;i<scores.size();i++){
            if(scores.get(i).getId() == r){
                o = i;
            }
        }

        if (scores.get(o).isLocked() == false) {
            l = true;
            do{
                l = true;
                System.out.println("Уверены, что хотите заблокировать этот счёт? Сумма сгорит");
                ans = scan.next();
                if(ans.equals("Да")) {
                    l = true;
                }else if(ans.equals("Нет")){
                    break;
                }else{
                    System.out.println("Ошибка, повторите вводе!");
                    l=false;
                }
            }while (!l);
            scores.get(o).setSum(0);
            scores.get(o).setLocked(true);
            System.out.println("Счёт успешно заблокирован");
        }else{
            l = true;
            do{
                l = true;
                System.out.println("Разблокировать этот счёт? Сумма = 0");
                ans = scan.next();
                if(ans.equals("Да")) {
                    l = true;
                }else if(ans.equals("Нет")){
                    break;
                }else{
                    System.out.println("Ошибка, повторите вводе!");
                    l=false;
                }
            }while (!l);
            scores.get(o).setSum(0);
            scores.get(o).setLocked(false);
            System.out.println("Счёт успешно разблокирован");
        }


        return scores;
    }

    public void out(ArrayList<Score> scores){
        for(int i=0;i<scores.size();i++){
            System.out.println("\n_______________________________________________________________________________");
            System.out.print("| Номер - " + scores.get(i).getId());
            System.out.print("\n| Сумма - " + scores.get(i).getSum());
            System.out.print("\n| Процент - " + scores.get(i).getPercent());
            System.out.print("\n| Блокирова - " + scores.get(i).isLocked());
            System.out.println("\n_______________________________________________________________________________");
        }
    }

    public ArrayList<Score> sort(ArrayList<Score> scores){
        Score s = new Score();
        System.out.println("Было: ");
        out(scores);
        System.out.println("Стало: ");
        for(int i=0;i<scores.size();i++){
            for(int j=0;j<scores.size();j++){
                if(scores.get(i).getSum()<scores.get(j).getSum()){
                    s = scores.get(i);
                    scores.set(i,scores.get(j));
                    scores.set(j,s);
                }
            }
        }
        out(scores);
        return scores;
    }

    public void sumall(ArrayList<Score> scores){
        int sum=0;
        for(int i = 0; i < scores.size(); i++ ){
            sum+=scores.get(i).getSum();
        }
        System.out.println("Сумма всех счетов = " + sum);
    }

    public void positsum(ArrayList<Score> scores){
        int sum=0;
        for(int i = 0; i < scores.size(); i++ ){
            if(scores.get(i).getSum()>0) {
                sum += scores.get(i).getSum();
            }
        }
        System.out.println("Сумма положительных счетов = " + sum);
    }

    public void negatsum(ArrayList<Score> scores){
        int sum=0;
        for(int i = 0; i < scores.size(); i++ ){
            if(scores.get(i).getSum()<0) {
                sum += scores.get(i).getSum();
            }
        }
        System.out.println("Сумма отрицательных счетов = " + sum);
    }

    @Override
    public String toString() {
        return "Клиент{" +
                "имя='" + name + '\'' +
                ", идентификатор=" + id +
                ", возраст=" + year +
                ", счета=" + scores +
                '}';
    }
}
