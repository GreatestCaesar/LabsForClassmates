package Task1;

public class Headphones {                                    // наушники
    private double weight;                                   // вес
    private double time;                                     // время зарядки
    private String type;                                     // тип(беспроводные/проводные)
    private String material;                                 // материал(пластик/металл)

    public Headphones(double weight, double time, String type, String material) {
        this.weight = weight;
        this.time = time;
        this.type = type;
        this.material = material;
    }

    public Headphones() {
        weight = 0;
        time = 0;
        type = "";
        material = "";
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public double getTime() {
        return time;
    }

    public void setTime(double time) {
        this.time = time;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public void mic(int n){                                                                         // наличие микрофона
       switch (n){
           case 1:{
               System.out.println("Наушники имеют микрофон");
               break;
           }
           case 2:{
               System.out.println("Наушники не имеют микрофон");
               break;
           }
       }
    }

    public String color(){                                                                                       // цвет
        return "Наушники есть в белом и чёрном цветах";
    }

    public void ti(){                                                                                    // время работы
        if(time<2){
            System.out.println("Время работы наушников 6 часов");
        }else if(time>=2){
            System.out.println("Время работы наушников 8 часов");
        }
    }

    @Override
    public String toString() {
        return "Наушники{" +
                "вес=" + weight +
                ", время зарядки=" + time +
                ", тип='" + type + '\'' +
                ", материал='" + material + '\'' +
                '}';
    }
}
