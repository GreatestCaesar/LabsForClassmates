package Third_Tusk;

public class Link {
    public String surname; // Данные
    public String number;
    public Link next; // Следующий элемент в списке
    // -------------------------------------------------------------
    public Link(String surname, String number) // Конструктор
    {
        this.surname = surname; // Инициализация данных
        this.number = number;
                    // (‘next’ автоматически
    }               // присваивается null)
    // -------------------------------------------------------------
    public void displayLink() // Вывод содержимого элемента
    {
        System.out.println("{" + surname + ", " + number + "}");
    }
}
