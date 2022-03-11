package Task1;

import java.util.Scanner;

public class MobilePhone { // мобильный телефон
    private String type; // тип экрана
    private double gage; // толщина
    private double diagonal; // диагональ
    private int acum; // аккумулятор
    private int sim; // кол-во сим-карт
    private String cam; // разрешение камеры
    private double vers; // версия ОС
    private int mem; // постоянная память

    public MobilePhone(String type, double gage, double diagonal, int acum, int sim, String cam, double vers, int mem) {
        this.type = type;
        this.gage = gage;
        this.diagonal = diagonal;
        this.acum = acum;
        this.sim = sim;
        this.cam = cam;
        this.vers = vers;
        this.mem = mem;
    }

    public MobilePhone() {
        type = "";
        gage = 0;
        diagonal = 0;
        acum = 0;
        sim = 0;
        cam = "";
        vers = 0;
        mem = 0;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public double getGage() {
        return gage;
    }

    public void setGage(double gage) {
        this.gage = gage;
    }

    public double getDiagonal() {
        return diagonal;
    }

    public void setDiagonal(double diagonal) {
        this.diagonal = diagonal;
    }

    public int getAcum() {
        return acum;
    }

    public void setAcum(int acum) {
        this.acum = acum;
    }

    public int getSim() {
        return sim;
    }

    public void setSim(int sim) {
        this.sim = sim;
    }

    public String getCam() {
        return cam;
    }

    public void setCam(String cam) {
        this.cam = cam;
    }

    public double getVers() {
        return vers;
    }

    public void setVers(double vers) {
        this.vers = vers;
    }

    public int getMem() {
        return mem;
    }

    public void setMem(int mem) {
        this.mem = mem;
    }

    public void addacum(){ // увеличить мощность аккум
        System.out.println("Мощность увеличена на 100мАч");
        acum += 100;
    }

    public void newp(String s){ // новый/старый
        if(s.equals("Сенсорный")){
            System.out.println("Данная модель нового поколения");
        }else{
            System.out.println("Данная модель старая");
        }
    }

    public void acum(int ... x){
        System.out.println("Партнёр поставил аккумуляторы с объёмами заряда: ");
        for(int i=0;i<x.length;i++){
            System.out.println(x[i]);
        }
    }

    public void remgage(){ // уменьшение тощины
        System.out.println("Толщина уменьшена на 0.01мм");
        gage -= 0.01;
    }

    public String NFC(int n){
        String s = "";
        switch (n){
            case 1:{
                s = "В телефоне имеется NFC";
                break;
            }
            case 2:{
                s = "В телефоне нет NFC";
                break;
            }
        }
        return s;
    }

    public void NFC(){
        System.out.println("В день акции в комплект к телефону подарок часы с поддержкой NFC");
    }

    public void mem(){
        Scanner s = new Scanner(System.in);
        int n;
        System.out.println("Данный телефон имеет версии с \n1. 16 Гб\n2. 32 Гб\n3. 128 Гб");
        n = s.nextInt();
        switch (n){
            case 1:{
                System.out.println("Выбарана версия с 16 Гб памяти");
                break;
            }
            case 2:{
                System.out.println("Выбарана версия с 32 Гб памяти");
                break;
            }
            case 3:{
                System.out.println("Выбарана версия с 128 Гб памяти");
                break;
            }
        }
    }

    public String memo(){
        mem += 4;
        return "Постоянная память увеличена до " + mem;
    }

    public String sim(){
        return "Данный телефон поддерживается мини и микро сим-карты";
    }

    @Override
    public String toString() {
        return "Мобильный телефон{" +
                "тип экрана='" + type + '\'' +
                ", толщина=" + gage +
                ", диагональ=" + diagonal +
                ", аккумулятор=" + acum +
                ", кол-во сим-карт=" + sim +
                ", разрешение камеры='" + cam + '\'' +
                ", версия ОС=" + vers +
                ", постоянная память=" + mem +
                '}';
    }
}
