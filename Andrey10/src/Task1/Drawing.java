package Task1;

public class Drawing extends Notebook{
    private boolean coloring; // наличие рисунков для раскраски
    private boolean page; // отрывные ли страница

    public Drawing(int num, boolean num1, String tree, boolean coloring, boolean page) {
        super(num, num1, tree);
        this.coloring = coloring;
        this.page = page;
    }

    public boolean isColoring() {
        return coloring;
    }

    public void setColoring(boolean coloring) {
        this.coloring = coloring;
    }

    public boolean isPage() {
        return page;
    }

    public void setPage(boolean page) {
        this.page = page;
    }

    public void erase(){
        System.out.println("Стереть рисунок");
    }

    @Override
    public void snatch(int n) {
        super.snatch(n);
    }

    @Override
    public String toString() {
        return "Раскраска{" +
                "кол-во страниц=" + getNum() +
                ", наличие нумерации=" + isNum1() +
                ", из какого дерева='" + getTree()  + '\'' +
                ", рисунки для раскрашивания=" + coloring +
                ", отрывные страницы=" + page +
                '}';
    }
}
