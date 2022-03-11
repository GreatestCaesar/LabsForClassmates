package Lab;

import java.util.Scanner;

public class Main {
    static public void main(String[] args) throws InterruptedException {
        Scanner s = new Scanner(System.in);
        Electricity e = new Electricity();
        FirstAid f = new FirstAid();

        boolean k = true;
        char o;

        System.out.print("Добро пожаловать!");
        while(k){
            System.out.print("\n1. Охрана труда при работе с электричеством\t\t2. Первая медицинская помощь при ожогах\t\t0. Выход\n");
            o = s.next ().charAt(0);
            switch(o){
                case '1':{
                    menuElec(e);
                    break;
                }
                case '2':{
                    menu_First_Aid(f);
                    break;
                }
                case '0':{
                    System.out.print("До свидания!\n\n\n\n\n");
                    k = false;
                    break;
                }
                default:{
                    System.err.print("Повторите ввод!\n");
                    break;
                }
            }
        }
    }

    public static void menuElec(Electricity electricity){
        Scanner s = new Scanner(System.in);
        boolean k = true;
        char o;

        while(k){
            System.out.print("1. Тест\t\t2. Игра\t\t3. Данные\t\t4. Обязанности\t\t0. Назад\n");
            o = s.next ().charAt(0);
            switch(o){
                case '1':{
                    electricity.test();
                    break;
                }
                case '2':{
                    electricity.game();
                    break;
                }
                case '3':{
                    boolean l = true;
                    while (l) {
                        System.out.print("1. 1й способ\t\t2. 2й способ\t\t3. Все данные\t\t0. Назад\n");
                        o = s.next().charAt(0);
                        switch (o) {
                            case '1': {
                                System.out.println(electricity.toString(electricity.getName(), electricity.getRaiting()));
                                break;
                            }
                            case '2': {
                                System.out.println(electricity.toString(electricity.getName(), electricity.getGroup()));
                                break;
                            }
                            case '3':{
                                electricity.Show();
                                break;
                            }
                            case '0': {
                                l = false;
                                break;
                            }
                            default: {
                                break;
                            }
                        }
                    }
                    break;
                }
                case '4':{
                    boolean l = true;
                    while (l) {
                        System.out.print("1. Обязанности по квалификации\t\t2. Обязанности по рейтингу\t\t0. Назад\n");
                        o = s.next().charAt(0);
                        switch (o) {
                            case '1': {
                                electricity.Duties(electricity.getRaiting());
                                break;
                            }
                            case '2': {
                                electricity.Duties(electricity.getQualification());
                                break;
                            }
                            case '0': {
                                l = false;
                                break;
                            }
                            default: {
                                System.out.println("Повторите ввод");
                                break;
                            }
                        }
                    }
                    break;
                }
                case '0':{
                    k = false;
                    break;
                }
                default:{
                    System.err.print("Повторите ввод!");
                }
            }
        }
    }

    public static void menu_First_Aid(FirstAid firstAid) throws InterruptedException {
        Scanner s = new Scanner(System.in);
        boolean k = true;
        char o;

        while(k){
            System.out.print("1. Помощь\t\t2. Данные\t\t0. Назад\n");
            o = s.next ().charAt(0);
            switch(o){
                case '1':{
                    firstAid.Category_Definition();
                    break;
                }
                case '2':{
                    boolean l = true;
                    while (l) {
                        System.out.print("1. Неизвестное число аргументов\t\t2. Cпособ\t\t3. Все данные\t\t0. Назад\n");
                        o = s.next().charAt(0);
                        switch (o) {
                            case '2':{
                                System.out.println(firstAid.toString(firstAid.getName(),firstAid.getAge(),firstAid.getDegree()));
                                break;
                            }
                            case '3':{
                                firstAid.Data();
                                break;
                            }
                            case '1':{
                                firstAid.VariableArgumnets(firstAid.getName(),firstAid.getCategory());
                                break;
                            }
                            case '0':{
                                l = false;
                                break;
                            }
                            default:{
                                System.out.println("Повторите ввод");
                                break;
                            }
                        }
                    }
                }
                case '0':{
                    k = false;
                    break;
                }
                default:{
                    System.err.print("Повторите ввод!");
                }
            }
        }
    }
}
