package Laba;

import java.util.Scanner;

public class CorrespondenceStudent extends Student{
    private double cost;

    public CorrespondenceStudent(String name, String surname, boolean payment, int truancy, boolean nonresident, double cost) {
        super(name, surname, payment, truancy,nonresident);
        this.cost = cost;
    }

    public CorrespondenceStudent() {
        super();
        this.cost = 0;
    }

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    @Override
    public void pay() {
        if(isPayment()==false){
            System.out.println("Отчислить данного студента за неуплату обучения");
        }else{
            System.out.println("Нет прблем с оплатой");
        }
    }

    public String hostel(){
        String str;
        if(isNonresident() == false){
            str = "Не нуждается в общежитии";
        }else{
            str = "Нуждается в общежитии";
        }
        return str;
    }

    @Override
    public void Cost(){
        Scanner s = new Scanner(System.in);
        char c;
        System.out.println("Разделить оплату на\n1. 3 этапа\n2. 2 этапа\n3. Оплатить сразу");
        c = s.nextLine().charAt(0);
        switch (c){
            case '1':{
                System.out.println("Оплатить первый взнос: " + cost/3 + " до 20 сентября" );
                break;
            }
            case '2':{
                System.out.println("Оплатить первый взнос: " + cost/2 + " до 20 сентября" );
                break;
            }
            case '3':{
                System.out.println("Оплатить: " + cost + " до 20 сентября" );
                break;
            }
        }
    }

    @Override
    public String toString() {
        return "Студент-Заочник{" +
                "Имя='" + getName() + '\'' +
                ", Фамилия='" + getSurname() + '\'' +
                ", оплата=" + isPayment() +
                ", иногородний=" + isNonresident() +
                ", стоимость=" + getCost() +
                '}';
    }
}
