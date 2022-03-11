package Hash;

class LinkList
{
    private Link first; // Ссылка на первый элемент списка
    // -------------------------------------------------------------
    public LinkList() // Конструктор
    {
        first = null; // Список пока не содержит элементов
    }
    // -------------------------------------------------------------
    public boolean isEmpty() // true, если список пуст
    {
        return (first==null);
    }
    // -------------------------------------------------------------
    public void insert(Link newLink) // Вставка в порядке сортировки
    {
        Link previous = null; // От начала списка
        Link current = first;
        // До конца списка
        while(current != null && current.word.compareTo(newLink.getWord())<0)
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
    // -------------------------------------------------------------
    public Link find(String word) // Поиск элемента с заданным ключом
    { // (предполагается, что список не пуст)
        Link current = first; // Начиная с 'first'
        while(current != null) // Пока совпадение не найдено
        {
            if(current.word.equals(word)) // Если достигнут конец списка
                return current; // и совпадение не найдено
            current = current.next; // Перейти к следующему элементу
        }
        return null; // Совпадение обнаружено
    }
    // -------------------------------------------------------------
    public Link delete(String word) // Удаление элемента с заданным ключом
    { // (предполагается, что список не пуст)
        Link current = first; // Поиск элемента
        Link previous = first;
        while(current != null)
        {
            if(current.word.equals(word))
            {
                if(current == first) {// Если первый элемент,
                    first = first.next; // изменить first
                }
                else {// В противном случае
                    previous.next = current.next; // обойти его в списке
                }
                return current;
            }
            else
            {
                previous = current; // Перейти к следующему элементу
                current = current.next;
            }
        } // Совпадение найдено
        return null; // Элемент не найден
    }
    // -------------------------------------------------------------
    public void displayList() // Вывод содержимого списка
    {
        System.out.print("Слова: ");
        Link current = first; // От начала списка
        while(current != null) // Перемещение до конца списка
        {
            current.displayLink(); // Вывод данных
                current = current.next; // Переход к следующему элементу
        }
        System.out.println("");
    }

    public Link displayFirst(){
        return first;
    }
// -------------------------------------------------------------
} // Конец класса LinkList
///////////////////////////////////////////////////////////////