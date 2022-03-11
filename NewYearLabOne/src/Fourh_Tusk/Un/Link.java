package Fourh_Tusk.Un;

public class Link {
    public String number;
    public Link next; // Следующий элемент в списке
    // -------------------------------------------------------------
    public Link(String number) // Конструктор
    {
        this.number = number;
                    // (‘next’ автоматически
    }               // присваивается null)
    // -------------------------------------------------------------
    public void displayLink() // Вывод содержимого элемента
    {
        System.out.print("Номер: " + number + " ");
    }
}
