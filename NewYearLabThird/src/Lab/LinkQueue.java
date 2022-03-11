package Lab;

import java.util.Scanner;

public class LinkQueue {
    private LinkList theList;
    //--------------------------------------------------------------
    public LinkQueue() // Конструктор
    { theList = new LinkList(); } // Создание 2-стороннего списка
    //--------------------------------------------------------------
    public boolean isEmpty() // true, если очередь пуста
    { return theList.isEmpty(); }
    //--------------------------------------------------------------
    public void insert(long j) // Вставка элемента в конец очереди
    { theList.insert(j); }
    //--------------------------------------------------------------
    public long remove() // Удаление элемента в начале очереди
    { return theList.deleteFirst(); }
    //--------------------------------------------------------------
    public void displayQueue()
    {
        System.out.print("Queue (front-->rear): ");
        theList.displayList();
    }
    public void find(){
        long x = 0;
        Link c = null;
        Scanner s = new Scanner(System.in);
        System.out.println("Введите элемент, который хотите найти: ");
        x = s.nextLong();
        c = theList.find(x);
        if(c == null)
            System.out.println("Элемент не найден!");
        else {
            System.out.print("Элемент найден - ");
            c.displayLink();
            System.out.println();
        }
    }
//--------------------------------------------------------------
} // Конец класса LinkQueue