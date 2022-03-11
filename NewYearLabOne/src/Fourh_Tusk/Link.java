package Fourh_Tusk;

class Link
{
    public String number;
    public Link next; // Следующий элемент в списке
    public Link previous; // Предыдущий элемент в списке
    // -------------------------------------------------------------
    public Link(String number) // Конструктор
    { this.number = number; }
    // -------------------------------------------------------------
    public void displayLink() // Вывод содержимого элемента
    {
        System.out.print("Номер: " + number + " ");
    }
}
