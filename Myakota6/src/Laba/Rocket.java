package Laba;

public class Rocket {
    private String name;
    private int year;
    private String country;
    private int place;
    private double weight;
    private double length;
    private String cosmodrome;
    private String date;// название, срок службы, страна производитель, число места, вес, длина, космодром, дата первого запуска

    public Rocket(String name, int year, String country, int place, double weight, double length, String cosmodrome, String date) {
        this.name = name;
        this.year = year;
        this.country = country;
        this.place = place;
        this.weight = weight;
        this.length = length;
        this.cosmodrome = cosmodrome;
        this.date = date;
    }

    Rocket(){
        name = "";
        year = 0;
        country = "";
        place = 0;
        weight = 0;
        length = 0;
        cosmodrome = "";
        date = "";
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public int getPlace() {
        return place;
    }

    public void setPlace(int place) {
        this.place = place;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public String getCosmodrome() {
        return cosmodrome;
    }

    public void setCosmodrome(String cosmodrome) {
        this.cosmodrome = cosmodrome;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String Serviceability(){
        String str;
        if(year>15){
            str = "Ракета не пригодна к использованию";
        }else{
            str = "Ракету можно использовать";
        }
        return str;
    }

    public void Atmosphere(){
        System.out.println("Ракета носитель " + getName() + " отстыковыввается на высоте в 600км");
    }

    public String Speed(){
        return "Ракета-носитель " + getName() + " разгоняет закреплённый на ней космический корабль до скорости 8650 км/ч";
    }

    public void WeightCargo(){
        System.out.println("Ракета может поднять груз массов в 13150кг");
    }

    public String Fuel(){
        return "Количество топлива необходимое для запуска и полёта 6700т";
    }

    public void WeightEngine(){
        System.out.println("Масса двигателей в сумме равна ~26,5т");
    }

    public String Language(int n){
        String str = "";
        if(n==1){
            str = "Выбран \"Русский язык\"";
        }else if(n==2){
            str = "The language is English";
        }
        return str;
    }

    @Override
    public String toString() {
        return "Ракетаt{" +
                "название='" + name + '\'' +
                ", срок службы=" + year +
                ", страна производитель='" + country + '\'' +
                ", число мест=" + place +
                ", вес=" + weight +
                ", длина=" + length +
                ", космодром='" + cosmodrome + '\'' +
                ", дата первого запуска='" + date + '\'' +
                '}';
    }
}
