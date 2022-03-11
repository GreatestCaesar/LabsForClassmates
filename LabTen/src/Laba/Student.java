package Laba;

abstract class Student implements Enrollee{
    private String name;
    private String surname;
    private boolean payment;
    private int truancy;
    private boolean nonresident;

    public Student() {
        this.name = "";
        this.surname = "";
        this.payment = true;
        this.truancy = 0;
        this.nonresident = true;
    }

    public Student(String name, String surname, boolean payment, int truancy, boolean nonresident) {
        this.name = name;
        this.surname = surname;
        this.payment = payment;
        this.truancy = truancy;
        this.nonresident = nonresident;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public boolean isPayment() {
        return payment;
    }

    public void setPayment(boolean payment) {
        this.payment = payment;
    }

    public int getTruancy() {
        return truancy;
    }

    public void setTruancy(int truancy) {
        this.truancy = truancy;
    }

    public boolean isNonresident() {
        return nonresident;
    }

    public void setNonresident(boolean nonresident) {
        this.nonresident = nonresident;
    }

    @Override
    public void pay(){
        if(payment==false){
            System.out.println("Отчислить данного студента за неуплату обучения");
        }else{
            System.out.println("Нет прблем с оплатой");
        }
    }

    public void tru(){
        if(truancy>10 && truancy<20){
            System.out.println("Лишить стипендии на месяц");
        }else if(truancy>20 && truancy<120){
            System.out.println("Выселить из общежития");
        }else if(truancy>120 ){
            System.out.println("Отчислить");
        }
    }
    abstract void Cost();

    @Override
    public String hostel(){
        String str;
        if(nonresident == false){
            str = "Не нуждается в общежитии";
        }else{
            str = "Нуждается в общежитии";
        }
        return str;
    }

    @Override
    public String toString() {
        return "Студент{" +
                "Имя='" + name + '\'' +
                ", Фамилия='" + surname + '\'' +
                ", оплата=" + payment +
                ", прогулы=" + truancy +
                ", иногородний=" + nonresident +
                '}';
    }


}
