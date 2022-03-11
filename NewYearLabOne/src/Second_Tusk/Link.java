package Second_Tusk;

public class Link {
    public int iData; // Данные
    public String name;
    public Link next; // Следующий элемент в списке
    // -------------------------------------------------------------
    public Link(int id, String name) // Конструктор
    {
        iData = id; // Инициализация данных
        this.name = name;
                    // (‘next’ автоматически
    }               // присваивается null)
    // -------------------------------------------------------------
    public void displayLink() // Вывод содержимого элемента
    {
        System.out.print("{" + iData + ", " + name + "} ");
    }
}
