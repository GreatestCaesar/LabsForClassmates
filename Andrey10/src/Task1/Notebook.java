package Task1;

public class Notebook implements Paper{
    private String type; // тип "линейка" "клетка"
    private int num; // кол-во страниц
    private boolean num1; // нумерация
    private String tree; // из какого дерева сделана

    public Notebook(String type, int num, boolean num1, String tree) {
        this.type = type;
        this.num = num;
        this.num1 = num1;
        this.tree = tree;
    }

    public Notebook(int num, boolean num1, String tree) {
        this.num = num;
        this.num1 = num1;
        this.tree = tree;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public boolean isNum1() {
        return num1;
    }

    public void setNum1(boolean num1) {
        this.num1 = num1;
    }

    public String getTree() {
        return tree;
    }

    public void setTree(String tree) {
        this.tree = tree;
    }

    public void sign(String str){
        System.out.println("Подписать тетрадь как" + str);
    }

    @Override
    public void snatch(int n) {
        if(n>num){
            System.out.println("Невозможно вырвать столько листов");
        }else{
            System.out.println("Вырвать " + n + " листов");
            num -= n;
        }
    }

    @Override
    public String toString() {
        return "Тетрадь{" +
                "тип='" + type + '\'' +
                ", кол-во страниц=" + num +
                ", наличие нумерации=" + num1 +
                ", из какого дерева='" + tree + '\'' +
                '}';
    }
}
