package Task1;

public class Surgeon implements Doctor{
    private String name; // имя
    private int age; // возраст
    private int exp; // стаж
    private int num; // кол-во спасённых людей

    public Surgeon() {
        name = "";
        age = 0;
        exp = 0;
        num = 0;
    }

    public Surgeon(String name, int age, int exp, int num) {
        this.name = name;
        this.age = age;
        this.exp = exp;
        this.num = num;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getExp() {
        return exp;
    }

    public void setExp(int exp) {
        this.exp = exp;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    @Override
    public void operation(String s, int t, boolean l) {
        if(l){
            System.out.println("Операция на \'" + s + "\' прошла успешно и составила " + t + " часа(ов)");
            setNum(getNum()+1);
        }else{
            System.out.println("Операция закончилась безуспешно");
            setNum(getNum()-1);
        }
    }

    public void place(int n){
        switch (n){
            case 1:{
                System.out.println("Врач не занимается хирургической практикой и проводит осмотры в поликлинике");
                break;
            }
            case 2:{
                System.out.println("Врач всё также успешно проводит операции");
            }
        }
    }

    @Override
    public String toString() {
        return "Хирург{" +
                "имя='" + name + '\'' +
                ", возраст=" + age +
                ", стаж=" + exp +
                ", кол-во прооперированных=" + num +
                '}';
    }
}
