package Task2;

import java.util.Arrays;
import java.util.Scanner;

public class Salad {
    private Cabbage[] cabbages;
    private Carrot[] carrots;
    private Pepper[] peppers;

    public Cabbage[] getCabbages() {
        return cabbages;
    }

    public void setCabbages(Cabbage[] cabbages) {
        this.cabbages = cabbages;
    }

    public Carrot[] getCarrots() {
        return carrots;
    }

    public void setCarrots(Carrot[] carrots) {
        this.carrots = carrots;
    }

    public Pepper[] getPeppers() {
        return peppers;
    }

    public void setPeppers(Pepper[] peppers) {
        this.peppers = peppers;
    }

    public Salad creat(Salad s){
        Scanner scan = new Scanner(System.in);
        boolean l=true;
        char c;
        while(l) {
            System.out.println("Добавить в салат:\t1. Капуста\t2. Морковь\t3. Перец\t0. Назад");
            c = scan.next().charAt(0);
            switch (c){
                case '1':{
                    Cabbage caba = new Cabbage();
                    Cabbage[] cab;
                    if(s.getCabbages()==null){
                         cab = new Cabbage[1];
                    }else{
                        cab = new Cabbage[s.getCabbages().length+1];
                        for(int i=0;i<s.getCabbages().length;i++){
                            cab[i] = s.getCabbages()[i];
                        }
                    }
                    System.out.println("Введите калорийность капусты: ");
                    caba.setCalorie(scan.nextDouble());
                    System.out.println("Введите вес капусты: ");
                    caba.setWeight(scan.nextDouble());
                    System.out.println("Введите цвет капусты: ");
                    scan.nextLine();
                    caba.setColor(scan.nextLine());
                    System.out.println("Введите кол-во витаминов: ");
                    caba.setVitamins(scan.nextInt());
                    cab[cab.length-1] = caba;
                    s.setCabbages(cab);
                    break;
                }
                case '2':{
                    Carrot carr = new Carrot();
                    Carrot[] car;
                    if(s.getCarrots()==null){
                        car = new Carrot[1];
                    }else{
                        car = new Carrot[s.getCarrots().length+1];
                        for(int i=0;i<s.getCarrots().length;i++){
                            car[i] = s.getCarrots()[i];
                        }
                    }
                    System.out.println("Введите калорийность моркови: ");
                    carr.setCalorie(scan.nextDouble());
                    System.out.println("Введите вес моркови: ");
                    carr.setWeight(scan.nextDouble());
                    System.out.println("Введите цвет моркови: ");
                    scan.nextLine();
                    carr.setColor(scan.nextLine());
                    System.out.println("Введите кол-во витаминов: ");
                    carr.setVitamins(scan.nextInt());
                    car[car.length-1] = carr;
                    s.setCarrots(car);
                    break;
                }
                case '3':{
                    Pepper pepp = new Pepper();
                    Pepper[] pep;
                    if(s.getPeppers()==null){
                        pep = new Pepper[1];
                    }else{
                        pep = new Pepper[s.getPeppers().length+1];
                        for(int i=0;i<s.getPeppers().length;i++){
                            pep[i] = s.getPeppers()[i];
                        }
                    }
                    System.out.println("Введите калорийность перца: ");
                    pepp.setCalorie(scan.nextDouble());
                    System.out.println("Введите вес перца: ");
                    pepp.setWeight(scan.nextDouble());
                    System.out.println("Введите цвет перца: ");
                    scan.nextLine();
                    pepp.setColor(scan.nextLine());
                    System.out.println("Введите кол-во витаминов: ");
                    pepp.setVitamins(scan.nextInt());
                    pep[pep.length-1] = pepp;
                    s.setPeppers(pep);
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
        return s;
    }

    public void out(Salad s){
        System.out.println(s);
    }

    public Salad sort(Salad s){
        Carrot c = new Carrot();
        Cabbage cab = new Cabbage();
        Pepper p = new Pepper();
        Carrot[] car;
        Cabbage[] cabb;
        Pepper[] pep;
        if(s.getCarrots()!=null){
            car = s.getCarrots();

            for(int i=0;i<car.length;i++){
                for(int j=i+1;j<car.length;j++){
                    if(car[i].getWeight()>car[j].getWeight()){
                        c = car[i];
                        car[i] = car[j];
                        car[j] = c;
                    }
                }
            }
            s.setCarrots(car);
        }

        if (s.getCabbages() != null) {
            cabb = s.getCabbages();

            for(int i=0;i<cabb.length;i++){
                for(int j=i+i;j<cabb.length;j++){
                    if(cabb[i].getWeight()>cabb[j].getWeight()){
                        cab = cabb[i];
                        cabb[i] = cabb[j];
                        cabb[j] = cab;
                    }
                }
            }
            s.setCabbages(cabb);
        }

        if(s.getPeppers() != null){
            pep = s.getPeppers();

            for(int i=0;i<pep.length;i++){
                for(int j=i+1;j<pep.length;j++){
                    if(pep[i].getWeight()>pep[j].getWeight()){
                        p = pep[i];
                        pep[i] = pep[j];
                        pep[j] = p;
                    }
                }
            }
            s.setPeppers(pep);
        }

        return s;
    }

    @Override
    public String toString() {
        return "Салат{" +
                "\nкапуста=" + Arrays.toString(cabbages) +
                "\nморковь=" + Arrays.toString(carrots) +
                "\nперец=" + Arrays.toString(peppers) +
                '}';
    }
}
