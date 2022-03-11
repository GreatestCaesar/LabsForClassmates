package Task2;

public class Site extends Web implements Data{
    private int year; // год создания
    private int num; // кол-во разработчиков
    private String lang; // язык для разработки

    public Site(String name, int year, int num, String lang) {
        super.setName(name);
        this.year = year;
        this.num = num;
        this.lang = lang;
    }

    public Site() {
        super.setName("");
        year = 0;
        num = 0;
        lang = "";
    }

    @Override
    public int getYear() {
        return year;
    }

    @Override
    public void setYear(int year) {
        this.year = year;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public String getLang() {
        return lang;
    }

    public void setLang(String lang) {
        this.lang = lang;
    }

    @Override
    public void update() {
        System.out.println("Сайт переносится на новый движок, для быстрой загрузки и отпимизации");
    }

    @Override
    public boolean data(int n) { // кол-во запросов сколько может обрабатывать
        boolean k;
        if(n>1000){
            k = false;
        }else{
            k = true;
        }
        return k;
    }

    @Override
    public String toString() {
        return "Сайт{" +
                "название='" + super.getName() + '\'' +
                ", год создания=" + year +
                ", кол-во разработчиков=" + num +
                ", язык разработки='" + lang + '\'' +
                '}';
    }
}
