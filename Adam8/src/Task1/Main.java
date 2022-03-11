package Task1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        Country c = new Country();
        boolean n = true;
        char k;
        while (n){
            System.out.println("1. Создать государство\t2. Информация о государстве\t3. Работать с определенной областью\t4. Столица\t5. Кол-во областей\t6. Площадь\t7. Областные центры\t0. Выход");
            k = s.next().charAt(0);
            switch (k){
                case '1':{
                    if(c.getName()=="") {
                        c = c.creat(c);
                        break;
                    }else{
                        System.out.println("Государство уже существует");
                    }
                }
                case '2':{
                    if(c.getName()==""){
                        System.out.println("Государство не существует");
                    }else {
                        System.out.println(c);
                    }
                    break;
                }
                case '3':{
                    int x;
                    if(c.getRegions()==null){
                        System.out.println("У Государства нет областей");
                    }else{
                        for(int i=0;i<c.getRegions().length;i++){
                            System.out.println((i+1)+" область: " + c.getRegions()[i]);
                        }
                        System.out.println("Введите id области, с которой хотите поработать: ");
                        x = s.nextInt();
                        x-=1;
                        c.setRegions(c.work(c.getRegions(),x));
                    }
                    break;
                }
                case '4':{
                    if(c.getName()==""){
                        System.out.println("Государство не существует");
                    }else {
                        System.out.println(c.getCapitel());
                    }
                    break;
                }
                case '5':{
                    if(c.getRegions()==null){
                        System.out.println("У государства нет областей");
                    }else {
                        System.out.println(c.getRegions().length);
                    }
                    break;
                }
                case '6':{
                    double v=0;
                    if(c.getRegions()==null){
                        System.out.println("У государства нет областей");
                    }else {
                        for (int i = 0; i < c.getRegions().length; i++) {
                            for (int j = 0; j < c.getRegions()[i].getDistricts().length; j++) {
                                for (int f = 0; f < c.getRegions()[i].getDistricts()[j].getTown().length; f++) {
                                    v += c.getRegions()[i].getDistricts()[j].getTown()[f].getArea();
                                }
                            }
                        }
                        System.out.println("Площадь=" + v);
                    }
                    break;
                }
                case '7':{
                    if(c.getRegions()==null){
                        System.out.println("У государства нет областей");
                    }else {
                        for (int i = 0; i < c.getRegions().length; i++) {
                            System.out.println(c.getRegions()[i].getCenter());
                        }
                    }
                    break;
                }
                case '0':{
                    n = false;
                    break;
                }
                default:{
                    System.out.println("Ошибка");
                    break;
                }
            }
        }
        System.out.println("До свидания");
    }
}
