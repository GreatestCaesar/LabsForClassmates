package Laba;

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
            System.out.print("1. Тест\t\t2. Игра\t\t3. Данные\t\t0. Назад\n");
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
                    electricity.Show();
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
                    firstAid.Data();
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
}
