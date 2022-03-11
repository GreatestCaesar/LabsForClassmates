package First_Tusk;

public class Link
{
    public int iData; // Данные
    public int dData; // Данные
    public Link next; // Следующий элемент в списке
    // -------------------------------------------------------------
    public Link(int id, int dd) // Конструктор
    {
        iData = id; // Инициализация данных
        dData = dd; // (‘next’ автоматически
    }               // присваивается null)
    // -------------------------------------------------------------
    public void displayLink() // Вывод содержимого элемента
    {
        System.out.print("{" + iData + ", " + dData + "} ");
    }
}