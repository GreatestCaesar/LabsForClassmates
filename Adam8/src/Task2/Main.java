package Task2;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner c = new Scanner(System.in);
        boolean m = true;
        char k;
        Salad s = new Salad();
        while(m){
            System.out.println("1. Добавить ингредиент\t2. Просмотреть ингредиент\t3. Расчитать калорийность салата\t4. Сортировка\t5. Диапазон\t0. Выход");
            k = c.next().charAt(0);
            switch (k){
                case '1':{
                    s = s.creat(s);
                    break;
                }
                case '2':{
                    if(s.getPeppers()==null && s.getCarrots()==null && s.getCabbages()==null) {
                        System.out.println("В салате нет ингредиентов");
                    }else {
                        s.out(s);
                    }
                    break;
                }
                case '3':{
                    double sum = 0;
                    if(s.getPeppers()==null){
                        System.out.println("В салате нет перца, его калорийность не учитывается");
                    }else {
                        for (int i = 0; i < s.getPeppers().length; i++) {
                            sum += s.getPeppers()[i].getCalorie();
                        }
                    }
                    if(s.getCabbages()==null) {
                        System.out.println("В салате нет капусты, её калорийность не учитывается");
                    }else{
                        for (int i = 0; i < s.getCabbages().length; i++) {
                            sum += s.getCabbages()[i].getCalorie();
                        }
                    }
                    if(s.getCarrots()==null){
                        System.out.println("В салате нет моркови, её калорийность не учитывается");
                    }else {
                        for (int i = 0; i < s.getCarrots().length; i++) {
                            sum += s.getCarrots()[i].getCalorie();
                        }
                    }
                    if(sum == 0){
                        System.out.println("Салат не наполнен ингредиентами");
                    }else {
                        System.out.println("Калорийность салата = " + sum);
                    }
                    break;
                }
                case '4':{
                    if(s.getPeppers()==null && s.getCarrots()==null && s.getCabbages()==null) {
                        System.out.println("В салате нет ингредиентов, он не сортируется");
                    }else {
                        s = s.sort(s);
                        System.out.println("Сортировка прошла успешно");
                    }
                    break;
                }
                case '5':{
                    if(s.getPeppers()!=null || s.getCarrots()!=null || s.getCabbages()!=null) {
                        double h = 0, y = 0;
                        System.out.println("Введите начало диапазона: ");
                        h = c.nextDouble();
                        System.out.println("Введите конец диапазона: ");
                        y = c.nextDouble();
                        if (s.getPeppers() != null) {
                            for (int i = 0; i < s.getPeppers().length; i++) {
                                if (s.getPeppers()[i].getCalorie() >= h && s.getPeppers()[i].getCalorie() <= y) {
                                    System.out.println(s.getPeppers()[i]);
                                }
                            }
                        }
                        if (s.getCarrots() != null) {
                            for (int i = 0; i < s.getCarrots().length; i++) {
                                if (s.getCarrots()[i].getCalorie() >= h && s.getCarrots()[i].getCalorie() <= y) {
                                    System.out.println(s.getCarrots()[i]);
                                }
                            }
                        }
                        if (s.getCabbages() != null) {
                            for (int i = 0; i < s.getCabbages().length; i++) {
                                if (s.getCabbages()[i].getCalorie() >= h && s.getCabbages()[i].getCalorie() <= y) {
                                    System.out.println(s.getCabbages()[i]);
                                }
                            }
                        }
                    }else{
                        System.out.println("В салате нет ингредиентов");
                    }
                    break;
                }
                case '0':{
                    m = false;
                    break;
                }
                default:{
                    System.out.println("Ошибка");
                    break;
                }
            }
        }
    }
}
