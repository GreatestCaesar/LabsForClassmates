package Task2;

public class Book implements exc{
    private String name;
    private int page;
    private String author;
    private String publishing;
    private int year;
    private int rait;

    public Book(String name, int page, String author, String publishing, int year) {
        this.name = name;
        this.page = page;
        this.author = author;
        this.publishing = publishing;
        this.year = year;
    }

    public Book() {
        name = "";
        page = 0;
        author = "";
        publishing = "";
        year = 0;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPage() {
        return page;
    }

    public void setPage(int page) {
        this.page = page;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getPublishing() {
        return publishing;
    }

    public void setPublishing(String publishing) {
        this.publishing = publishing;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void complexity(){
        if(page>1000){
            System.out.println("Книга трудна для прочтения");
        }else if (page<1000){
            System.out.println("Проста для прочтения");
        }
    }

    public void novelty(){
        if(year<2000){
            System.out.println("Книга старая");
        }else if(year>2000 && year<2010){
            System.out.println("Не особо старая");
        }else if(year>2010 && year<2020){
            System.out.println("Книга новая");
        }
    }

    public void rait(int rait){
        this.rait = rait;
    }

    @Override
    public String toString() {
        return "Книга{" +
                "название='" + name + '\'' +
                ", количеество страниц=" + page +
                ", автор='" + author + '\'' +
                ", издательство='" + publishing + '\'' +
                ", год=" + year +
                ", оценка=" + rait +
                '}';
    }

    @Override
    public void exchange(int n) {
        if(n>45){
            System.out.println("Книга изношена, необходимо провести замену");
        }
    }
}
