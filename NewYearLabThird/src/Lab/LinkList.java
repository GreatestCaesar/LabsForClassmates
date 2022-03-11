package Lab;

public class LinkList {
    private Link first; // Ссылка на первый элемент списка
    private Link last; // Ссылка на последний элемент списка
    // -------------------------------------------------------------
    public LinkList() // Конструктор
    {
        first = null; // Список пока не содержит элементов
        last = null;
    }
    // -------------------------------------------------------------
    public boolean isEmpty() // true, если список пуст
    { return first==null; }

    public long deleteFirst() // Удаление первого элемента
    { // (предполагается, что список не пуст)
        Link temp = first;
        if(first.next == null) // Если только один элемент
            last = null; // null <-- last
        else
            first.next.previous = null; // null <-- старое значение next
        first = first.next; // first --> старое значение next
        return temp.dData;
    }

    public void insert(long key) // Вставка в порядке сортировки
    {
        Link newLink = new Link(key); // Создание нового элемента
        Link previous = null; // От начала списка
        Link current = first;
        // До конца списка
        while(current != null && key > current.dData)
        { // или если key > current,
            previous = current;
            current = current.next; // Перейти к следующему элементу
        }
        if(previous==null) // В начале списка
            first = newLink; // first --> newLink
        else // Не в начале
            previous.next = newLink; // старое значение prev --> newLink
        newLink.next = current; // newLink --> старое значение current
    }

    public void displayList()
    {
        Link current = first; // От начала списка
        while(current != null) // Перемещение до конца списка
        {
            current.displayLink(); // Вывод данных
            current = current.next; // Переход к следующему элементу
        }
        System.out.println("");
    }

    public Link find(long key) // Поиск элемента с заданным ключом
    { // (предполагается, что список не пуст)
        Link current = first; // Начиная с 'first'
        while(current.dData != key) // Пока совпадение не найдено
        {
            if(current.next == null) // Если достигнут конец списка
                return null; // и совпадение не найдено
            else // Если еще остались элементы
                current = current.next; // Перейти к следующему элементу
        }
        return current; // Совпадение обнаружено
    }
// --
}
