package laba_11;

import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

import MyException.MyException;
import ferry.Ferry;
import laba_12.Encryption;
import shipp.Ship;
import Write.Write;

public class laba_6 {
    public static void main(String[] args) throws MyException, IOException {
        int choice=5;
        boolean k=true;
        char l;


        while (k) {
            System.out.println("Выберите необходимый транспорт:");
            System.out.println("1.Корабль");
            System.out.println("2.Паром");
            System.out.println("3.Шифр Плейфера");
            System.out.println("0.Выход");
            System.out.println("Введите соответствующую цифру.");
            System.out.println();


            Scanner scan = new Scanner(System.in);
            try {                                                    // нахождение ошибки на ввод не текста, но программа прдолжает работать
                choice = scan.nextInt();
            }catch (Exception e){
                System.out.printf("Ошибка " + e.toString());
            }
            switch (choice) {
                case 1:
                    Ship S = new Ship(250,5,12,210,1050);
                    System.out.println(S);
                    S.Cost(S.getQuantity(),S.getPayback());
                    S.Cost(S.getQuantity(),S.getPrice());
                    S.Definition("Австрия");
                    S.Definition(S.getPayback(),S.getCost());
                    S.Oneday(S.getDay(),S.getPrice());
                    S.Ear(S.getDay());
                    S.Ear(S.getDay(),S.getQuantity());
                    System.out.println("Записать данные в файл?\n1. Да\t2. Нет");
                    l = scan.next().charAt(0);
                    switch (l){
                        case '1':{
                            new Write("S","C:\\Users\\Julius\\IdeaProjects\\Popastik17\\Ship\\",S); // S - ИМЯ, КОТОРОЕ ЗАПИШЕТСЯ В ФАЙЛ, ПУТЬ ВСТАВИТЬ СВОЙ ДО \\Ship(ЭТО ПАПКА, КОТОРАЯ СОЗДАТСЯ, А В НЕЙ СОЗДАТСЯ ФАЙЛ), S - ОБЪЕКТ, КОТОРЫЕ МЕТОДОМ toString ЗАПИШЕТ ДАННЫЕ В ФАЙЛ
                            break;
                        }
                        case '2':{
                            break;
                        }
                    }
                    break;
                case 2:
                    Ferry P = new Ferry(50,2.5,1,50,3000,0);
                    P.Mes(P.getQuantity(), P.getPayback());
                    P.Mas(P.getQuantity(), P.getMesto());
                    P.Mas(1, 5, 5);
                    P.Sca(5, 5, 4, 7);
                    P.Ear(5, 5, 4, 7);
                    P.Cost(P.getQuantity(), P.getPrice());
                    System.out.println("Записать данные в файл?\n1. Да\t2. Нет");
                    l = scan.next().charAt(0);
                    switch (l){
                        case '1':{
                            new Write("P","C:\\Users\\Julius\\IdeaProjects\\Popastik17\\Ferry\\",P);
                            break;
                        }
                        case '2':{
                            break;
                        }
                    }
                    break;

                case 3: {
                    Encryption e = new Encryption();
                    try {
                        e.enc();
                    }catch (MyException z){
                        System.out.println(z);
                    }
                }
                case 0: {
                    k = false;
                    break;
                }
                default: {
                    System.out.println("\nПовторите ввод");
                    break;
                }


            }
        }
    }
}