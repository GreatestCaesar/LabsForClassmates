package Task1;

import java.util.Arrays;
import java.util.Scanner;

public class Region{ // область
    private String name; // название обл. центра
    private String center; // областной центр
    private District[] districts; // районы

    public Region(String name, String center, District[] districts) {
        this.name = name;
        this.center = center;
        this.districts = districts;
    }

    public Region() {
        name = "";
        center = "";
        districts = null;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public District[] getDistricts() {
        return districts;
    }

    public void setDistricts(District[] districts) {
        this.districts = districts;
    }

    public String getCenter() {
        return center;
    }

    public void setCenter(String center) {
        this.center = center;
    }

    public Region[] creat(Region[] regions){
        District d = new District();
        Region reg = new Region();
        Region[] regs;
        Scanner scanner = new Scanner(System.in);
        boolean l = true;
        char n;
        System.out.println("Введите название области: ");
        reg.setName(scanner.nextLine());
        System.out.println("Введите название областного центра");
        reg.setCenter(scanner.nextLine());
        while (l){
            System.out.println("1. Создать район\t0. Вернуться назад");
            n = scanner.next().charAt(0);
            switch (n){
                case '1':{
                    if(regions == null){
                        regs = new Region[1];
                    }else{
                        regs = new Region[regions.length+1];
                        for(int i=0;i< regions.length;i++){
                            regs[i] = regions[i];
                        }
                    }
                    reg.setDistricts(d.create(reg.getDistricts()));
                    regs[regs.length-1] = reg;
                    regions = regs;
                    break;
                }
                case '2':{
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

    public District[] work(District[] districts, int p){
        District d = new District();
        Scanner scanner = new Scanner(System.in);
        boolean l = true;
        char n;
        while (l){
            System.out.println("1. Сменить название района\t2. Работать с определённым городом района\t0. Вернуться назад");
            n = scanner.next().charAt(0);
            switch (n){
                case '1':{
                    System.out.println("Введите новое название района: ");

                    scanner.nextLine();
                    districts[p].setName(scanner.nextLine());
                    break;
                }
                case '2':{
                    if(districts[p].getTown()==null){
                        System.out.println("У района нет городов");
                    }else {
                        int x;
                        for (int i = 0; i < districts[p].getTown().length; i++) {
                            System.out.println((i + 1) + " город: " + districts[p].getTown()[i]);
                        }
                        System.out.println("Введите id города, с которой хотите поработать: ");
                        x = scanner.nextInt();
                        x -= 1;
                        districts[p].setTown(d.work(districts[p].getTown(),x));
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
        return districts;
    }

    @Override
    public String toString() {
        return "\nОбласть{" +
                "\nназвание='" + name + '\'' +
                "\nобл. центр='" + center + '\'' +
                "\nрайоны=" + Arrays.toString(districts) +
                '}';
    }
}
