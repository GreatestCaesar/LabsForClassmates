package Fourh_Tusk;

import Fourh_Tusk.Un.LinkList;

class DoublyLinkedList {
    private Link first; // Ссылка на первый элемент списка
    private Link last; // Ссылка на последний элемент списка

    // -------------------------------------------------------------
    public DoublyLinkedList() // Конструктор
    {
        first = null; // Список пока не содержит элементов
        last = null;
    }

    // -------------------------------------------------------------
    public boolean isEmpty() // true, если список пуст
    {
        return first == null;
    }

    // -------------------------------------------------------------
    public void insertFirst(String number) // Вставка элемента в начало списка
    {
        Link newLink = new Link(number); // Создание нового элемента
        if (isEmpty()) // Если список не содержит элементов,
            last = newLink; // newLink <-- last
        else
            first.previous = newLink; // newLink <-- старое значение first
        newLink.next = first; // newLink --> старое значение first
        first = newLink; // first --> newLink
    }

    // -------------------------------------------------------------
    public void insertLast(String number) // элемент в конец списка
    {
        Link newLink = new Link(number); // Создание нового элемента
        if (isEmpty()) // Если список не содержит элементов,
            first = newLink; // first --> newLink
        else {
            last.next = newLink; // старое значение last --> newLink
            newLink.previous = last; // старое значение last <-- newLink
        }
        last = newLink; // newLink <-- last
    }

    // -------------------------------------------------------------
    public Link deleteFirst() // Удаление первого элемента
    { // (предполагается, что список не пуст)
        Link temp = first;
        if (first.next == null) // Если только один элемент
            last = null; // null <-- last
        else
            first.next.previous = null; // null <-- старое значение next
        first = first.next; // first --> старое значение next
        return temp;
    }

    // -------------------------------------------------------------
    public Link deleteLast() // Удаление последнего элемента
    { // (предполагается, что список не пуст)
        Link temp = last;
        if (first.next == null) // Если только один элемент
            first = null; // first --> null
        else
            last.previous.next = null; // старое значение previous --> null
        last = last.previous; // старое значение previous <-- last
        return temp;
    }

    // -------------------------------------------------------------
    public void displayForward() {
        System.out.print("List (first-->last): ");
        Link current = first; // От начала списка
        while (current != null) // Перемещение до конца списка
        {
            current.displayLink(); // Вывод данных
            current = current.next; // Переход к следующему элементу
        }
        System.out.println("");
    }

    // -------------------------------------------------------------
    public void displayBackward() {
        System.out.print("List (last-->first): ");
        Link current = last; // От начала списка
        while (current != null) // Перемещение до конца списка
        {
            current.displayLink(); // Вывод данных
            current = current.previous; // Переход к следующему элементу
        }
        System.out.println("");
    }

    public LinkList insertAnotherList(LinkList list){
        Link current = first; // От начала списка
        while (current != null) // Перемещение до конца списка
        {
            if(current.number.length()>3){
                list.sortInsert(current.number);
            }
            current = current.next; // Переход к следующему элементу
        }
        return list;
    }
}
