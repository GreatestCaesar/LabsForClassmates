package Laba;

public class MotorIndustry {
    String brand; // марка
    int count; // количество
    String BT; // тип кузова
    String ET; // тип двигателя

    MotorIndustry(){
        this.brand = "Опель";
        this.count = 100;
        this.BT = "Седан";
        this.ET = "Электро";
    }

    MotorIndustry(String b, int c, String bt, String et){
        this.brand = b;
        this.count = c;
        this.BT = bt;
        this.ET = et;
    }

    public void Price (int c){ // с - количество машин для заказа
        if(c > this.count){
            System.out.print("Мы не можем предоставить вам такое количество авто!\n");
        }else{
            System.out.print(c + " автомобиля марки - " + this.brand + " обойдутся вам в " + (12350*c) + "$\n");
        }
    }

    public String Price(String b, String bt){ // перегруженный метод
        return "Автомобиля марки - " + b + "в кузове " + bt + " обойдется вам в " + (15000) + "$\n";
    }

    public void Out(String ... n){ // метод с изменяемым числом входных параметров
        for(int i = 0; i<n.length;i++){
            System.out.println("Данные:" + n[i]);
        }
    }

    public void Reserve(){ // опреление запаса хода в зависимости от типа двигателя и типа кузова
        if(this.BT.equalsIgnoreCase("Седан")){
            if(this.ET.equalsIgnoreCase("Дизель")){
                System.out.print("В " + this.ET + " " + this.BT + " запас хода составляет 550км на полный бак\n");
            }else if(this.ET.equalsIgnoreCase("Бензин")){
                System.out.print("В " + this.ET + " " + this.BT + " запас хода составляет 490км на полный бак\n");
            }else if(this.ET.equalsIgnoreCase("Электро")){
                System.out.print("В " + this.ET + " " + this.BT + " запас хода составляет 300км на полном заряде\n");
            }
        }else if(this.BT.equalsIgnoreCase("Универсал")){
            if(this.ET.equalsIgnoreCase("Дизель")){
                System.out.print("В " + this.ET + " " + this.BT + " запас хода составляет 500км на полный бак\n");
            }else if(this.ET.equalsIgnoreCase("Бензин")){
                System.out.print("В " + this.ET + " " + this.BT + " запас хода составляет 430км на полный бак\n");
            }else if(this.ET.equalsIgnoreCase("Электро")){
                System.out.print("В " + this.ET + " " + this.BT + " запас хода составляет 360км на полном заряде\n");
            }
        }else if(this.BT.equalsIgnoreCase("Грузовик")){
            if(this.ET.equalsIgnoreCase("Дизель")){
                System.out.print("В " + this.ET + " " + this.BT + " запас хода составляет 350км на полный бак\n");
            }else if(this.ET.equalsIgnoreCase("Бензин")){
                System.out.print("В " + this.ET + " " + this.BT + " запас хода составляет 290км на полный бак\n");
            }else if(this.ET.equalsIgnoreCase("Электро")){
                System.out.print("В " + this.ET + " " + this.BT + " запас хода составляет 330км на полном заряде\n");
            }
        }
    }

    public void Power(){ // мощность двигателя в зависимости от типа
        if(this.ET.equalsIgnoreCase("Дизель")){
            System.out.print("Двигатель на " + this.ET + " топливе предлагается с объемом 2.9л, мощностью 144 Л.С.");
        }else if(this.ET.equalsIgnoreCase("Бензин")){
            System.out.print("Двигатель на " + this.ET + " топливе предлагается с объемом 4.4л, мощностью 210 Л.С.");
        }else if(this.BT.equalsIgnoreCase("Электро")){
            System.out.print("Двигатель с " + this.ET + " мотором предлагается с объемом 40кВт*ч, мощностью 362 Л.С.");
        }
    }

    public void Places(){ // места в авто
        if(this.BT.equalsIgnoreCase("Седан")){
            System.out.print("Авто типа " + this.BT + " поставляется с количеством 5, либо 4 полноценных метс для пассажиров");
        }else if(this.BT.equalsIgnoreCase("Универсал")){
            System.out.print("Авто типа " + this.BT + " поставляется с количеством 5, либо 7 полноценных мест для пассажиров");
        }else if(this.BT.equalsIgnoreCase("Грузовик")){
            System.out.print("Авто типа " + this.BT + " поставляется с количеством 3 полноценных мест для пассажиров");
        }
    }

    public void setBrand(String b) {this.brand = b;}
    public String getBrand() {return this.brand;}

    public void setCount(int c) {this.count = c;}
    public int getCount() {return this.count;}

    public void setBT(String bt) {this.BT = bt;}
    public String getBT() {return this.BT;}

    public void setET(String et) {this.ET = et;}
    public String getET() {return this.ET;}
}