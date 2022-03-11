package Second_Tusk;

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

    public void insertFirst(int id, String name)
    { // Создание нового элемента
        Link newLink = new Link(id, name);
        newLink.next = first; // newLink --> старое значение first
        first = newLink; // first --> newLink
    }

    public void displayList()
    {
        System.out.print("List (first-->last): ");
        Link current = first; // От начала списка
        while(current != null) // Перемещение до конца списка
        {
            current.displayLink(); // Вывод данных
            current = current.next; // Переход к следующему элементу
        }
        System.out.println("");
    }

    public void delete(int n) {
        Link current = first; // Поиск элемента
        Link previous = first;
        int k = 20;
        int c=1;
        while (k > 1) {
            while (c!=n) {
                if (current.next == null) {
                    current = first; // Элемент не найден
                    c++;
                } else {
                    previous = current; // Перейти к следующему элементу
                    current = current.next;
                    c++;
                }// Совпадение найдено
            }
            if(c==n) {
                if (current == first) {// Если первый элемент,
                    System.out.print("Удаляем: ");
                    first.displayLink();
                    first = first.next; // изменить first
                    k--;
                    c=0;
                    System.out.println();
                } else {// В противном случае
                    System.out.print("Удаляем: ");
                    current.displayLink();
                    previous.next = current.next; // обойти его в списке
                    k--;
                    c=0;
                    System.out.println();
                }
            }
        }
    }
}
