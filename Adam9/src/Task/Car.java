package Task;

public class Car extends Engine{ // авто
    private int max; // максимальная скорость
    private double weight; // вес

    public Car() {
        max = max;
        weight = weight;
    }

    public Car(int max, double weight) {
        this.max = max;
        this.weight = weight;
    }

    public int getMax() {
        return max;
    }

    public void setMax(int max) {
        this.max = max;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    @Override
    public void change() {
        System.out.println("В будущих моделя планируется добавить: \n1. Доводчики дверей \n2. Автопарковку \n3. Камеры ночного видения");
    }

    public void hitch(boolean g){
        if(g==true){
            System.out.println("В авто установлен фаркоп");
        }else{
            System.out.println("В авто отсутствует фаркоп");
        }
    }

    @Override
    public String toString() {
        return "Авто{" +
                "макс. скорость=" + max +
                ", вес=" + weight +
                '}';
    }
}
