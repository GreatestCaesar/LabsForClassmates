package Task1;

public class Neurosurgeon extends Surgeon{
    public Neurosurgeon() {
        super();
    }

    public Neurosurgeon(String name, int age, int exp, int num) {
        super(name, age, exp, num);
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

    public void age(){
        if(getAge()>60){
            System.out.println("Врач не может больше заниматься операциями на нервах в силу своего возраста");
        }else{
            System.out.println("Доктор продолжает работать");
        }
    }

    @Override
    public String toString() {
        return "Хирург{" +
                "имя='" + getName() + '\'' +
                ", возраст=" + getAge() +
                ", стаж=" + getExp() +
                ", кол-во прооперированных=" + getNum() +
                '}';
    }
}
