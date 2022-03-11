package Task1;

public class Theatre extends PublicBuilding{
    private int places; // кол-во мест

    public Theatre() {
        super();
        places = 0;
    }

    public Theatre(String name, double height, double widht, int year, int places) {
        super(name, height, widht, year);
        this.places = places;
    }

    public int getPlaces() {
        return places;
    }

    public void setPlaces(int places) {
        this.places = places;
    }

    @Override
    void corona() {
        System.out.println("В условиях короновируса, кол-во мест для посадки ограничено и доступно: " + (places/3));
    }

    @Override
    public String toString() {
        return "Театр{" +
                "название='" + super.getName() + '\'' +
                ", высота=" + super.getHeight() +
                ", ширина=" + super.getWidht() +
                ", год постройки=" + super.getYear() +
                ", кол-во посадочных мест=" + places +
                '}';
    }
}
