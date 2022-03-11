package Hash;

public class Link {
    public String word; // Данные
    public Link next; // Следующий элемент в списке
    // -------------------------------------------------------------
    public Link(String word) // Конструктор
    {
        this.word = word; // Инициализация данных
        // (‘next’ автоматически
    }               // присваивается null)
    // -------------------------------------------------------------
    public void displayLink() // Вывод содержимого элемента
    {
        System.out.println(word + " ");
    }

    public String getWord(){
        return word;
    }

    @Override
    public String toString() {
        return word;
    }
}