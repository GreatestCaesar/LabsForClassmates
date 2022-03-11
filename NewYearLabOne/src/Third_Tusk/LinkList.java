package Third_Tusk;

public class LinkList {
    private Link first; // Ссылка на первый элемент списка
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

    public void insertFirst(String surname, String number)
    { // Создание нового элемента
        Link newLink = new Link(surname,number);
        newLink.next = first; // newLink --> старое значение first
        first = newLink; // first --> newLink
    }

    public void displayList()
    {
        System.out.println("Абоненты: ");
        Link current = first; // От начала списка
        while(current != null) // Перемещение до конца списка
        {
            current.displayLink(); // Вывод данных
            current = current.next; // Переход к следующему элементу
        }
        System.out.println("");
    }

    public void find_sur(String surname){
        Link current = first; // От начала списка
        while(current != null) // Перемещение до конца списка
        {
            if(current.surname.equals(surname)){
                System.out.println("Номер телефона " + surname + ": " + current.number);
            }
            current = current.next; // Переход к следующему элементу
        }
    }

    public void find_numb(String number){
        Link current = first; // От начала списка
        while(current != null) // Перемещение до конца списка
        {
            if(current.number.equals(number)){
                System.out.println("Фамилия абонента с номером " + number + ": " + current.surname);
            }
            current = current.next; // Переход к следующему элементу
        }
    }

    public void sortInsert(String surname, String number) // Вставка в порядке сортировки
    {
        Link newLink = new Link(surname,number); // Создание нового элемента
        Link current = first; // Поиск элемента
        Link previous = first;
        // До конца списка
        while(current != null && current.surname.compareToIgnoreCase(surname)<0)
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
}
