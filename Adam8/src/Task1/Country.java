package Task1;

import java.util.Arrays;
import java.util.Scanner;

public class Country{ // государство
    private String name; // название страны
    private String capitel; // столица
    private Region[] regions;

    public Country(String name, String capitel, Region[] regions) {
        this.name = name;
        this.capitel = capitel;
        this.regions = regions;
    }

    public Country(){
        this.name = "";
        this.capitel = "";
        this.regions = null;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Region[] getRegions() {
        return regions;
    }

    public void setRegions(Region[] regions) {
        this.regions = regions;
    }

    public String getCapitel() {
        return capitel;
    }

    public void setCapitel(String capitel) {
        this.capitel = capitel;
    }

    public Country creat(Country country){
        Scanner scanner = new Scanner(System.in);
        Region r = new Region();
        boolean l = true;
        char n;
        System.out.println("Введите название государтсва: ");
        country.setName(scanner.nextLine());
        System.out.println("Введите столицу: ");
        country.setCapitel(scanner.nextLine());
        while (l){
            System.out.println("1. Добавить область\t0. Вернуться назад");
            n = scanner.next().charAt(0);
            switch (n){
                case '1':{
                    country.setRegions(r.creat(country.getRegions()));
                    break;
                }
                case '0':{
                    l = false;
                    break;
                }
                default:{
                    System.out.println("Ошибка");
                    break;
                }
            }
        }
        return country;
    }

    public Region[] work(Region[] regions, int p){
        Region r = new Region();
        Scanner scanner = new Scanner(System.in);
        boolean l = true;
        char n;
        while (l){
            System.out.println("1. Сменить название области\t2. Сменить областной центр\t3. Работать с определённым районом области\t0. Вернуться назад");
            n = scanner.next().charAt(0);
            switch (n){
                case '1':{
                    System.out.println("Введите новое название области: ");
                    scanner.nextLine();
                    regions[p].setName(scanner.nextLine());
                    break;
                }
                case '2':{
                    System.out.println("Введите новое название обл. центра: ");
                    scanner.nextLine();
                    regions[p].setCenter(scanner.nextLine());
                    break;
                }
                case '3':{
                    if(regions[p].getDistricts() == null){
                        System.out.println("У области нет районов");
                    }else {
                        int x;
                        for (int i = 0; i < regions[p].getDistricts().length; i++) {
                            System.out.println((i + 1) + " район: " + regions[p].getDistricts()[i]);
                        }
                        System.out.println("Введите id района, с которой хотите поработать: ");
                        x = scanner.nextInt();
                        x -= 1;
                        regions[p].setDistricts(r.work(regions[p].getDistricts(),x));
                    }
                    break;
                }
                case '0':{
                    l = false;
                    break;
                }
                default:{
                    System.out.println("Ошибка");
                    break;
                }
            }
        }
        return regions;
    }

    @Override
    public String toString() {
        return "\nСтрана{" +
                "\nназвание='" + name + '\'' +
                "\nобласти=" + Arrays.toString(regions) +
                '}';
    }
}
