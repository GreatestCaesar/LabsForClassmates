package Fourh_Tusk.Un;

public class LinkList {
    private Fourh_Tusk.Un.Link first; // Ссылка на первый элемент списка
    // -------------------------------------------------------------
    public void LinkList() // Конструктор
    {
        first = null; // Список пока не содержит элементов
    }
    // -------------------------------------------------------------
    public boolean isEmpty() // true, если список пуст
    {
        return (first==null);
    }
    // -------------------------------------------------------------
    // ... Другие методы

    public void insertFirst(String number)
    { // Создание нового элемента
        Fourh_Tusk.Un.Link newLink = new Link(number);
        newLink.next = first; // newLink --> старое значение first
        first = newLink; // first --> newLink
    }

    public void displayList()
    {
        System.out.print("List (last-->first): ");
        Fourh_Tusk.Un.Link current = first; // От начала списка
        while(current != null) // Перемещение до конца списка
        {
            current.displayLink(); // Вывод данных
            current = current.next; // Переход к следующему элементу
        }
        System.out.println("");
    }

    public void sortInsert(String number) // Вставка в порядке сортировки
    {
        Link newLink = new Link(number); // Создание нового элемента
        Link current = first; // Поиск элемента
        Link previous = first;
        // До конца списка
        while(current != null && (Integer.parseInt(number) > Integer.parseInt(current.number)))
        { // или если key > current,
            previous = current;
            current = current.next;
        }
        if(current == first) {
            // Если первый элемент,
            newLink.next = first; // newLink --> старое значение first
            first = newLink;
        }
        else {// В противном случае
            previous.next = newLink;
            newLink.next = current;
        }
    }

    public int size(){
        int k=0;
        Fourh_Tusk.Un.Link current = first; // От начала списка
        while(current != null) // Перемещение до конца списка
        {
            current = current.next; // Переход к следующему элементу
            k++;
        }
        return k;
    }
}
