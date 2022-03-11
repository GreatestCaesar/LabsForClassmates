package First_Tusk;

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

    public void insertFirst(int id, int dd)
    { // Создание нового элемента
        Link newLink = new Link(id, dd);
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

    public boolean equality(LinkList q){
        int n = 0;
        Link current = first; // От начала списка
        Link forQ = q.first;

        while(current != null) // Перемещение до конца списка
        {
            forQ = q.first;
            while(forQ != null){
                if(forQ.dData == current.dData && forQ.iData == current.iData){
                    n++;
                }
                forQ = forQ.next;
            }
            current = current.next;
        }

        if(n==size())
        {
            return true;
        }

        return false;
    }

    public void meaning(int x)
    {
        int sum = 0;
        Link current = first;
        while(current != null) // Перемещение до конца списка
        {
            sum += current.iData*Math.pow(x,current.dData);
            current = current.next;
        }
        System.out.println("значение многочлена - " + sum);
    }

    public LinkList add(LinkList p,LinkList q,LinkList r){
        Link forP = p.first;
        Link forQ = q.first;
        int x=0;

        for(int i=0;i<p.size();i++){
            forQ = q.first;
            for(int j=0;j<q.size();j++){
                if(forQ.dData == forP.dData){
                    r.insertFirst(forP.iData+ forQ.iData, forP.dData);
                }
                forQ = forQ.next;
            }
            forP = forP.next;
        }

        forP = p.first;
        forQ = q.first;

        for(int i=0;i<p.size();i++){
            forQ = q.first;
            x=0;
            for(int j=0;j<q.size();j++){
                if(forQ.dData != forP.dData){
                    x++;
                }
                forQ = forQ.next;
            }
            if(x==q.size()){
                r.insertFirst(forP.iData,forP.dData);
            }
            forP = forP.next;
        }

        forP = p.first;
        forQ = q.first;

        for(int i=0;i<q.size();i++){
            forP = p.first;
            x=0;
            for(int j=0;j<p.size();j++){
                if(forQ.dData != forP.dData){
                    x++;
                }
                forP = forP.next;
            }
            if(x==p.size()){
                r.insertFirst(forQ.iData, forQ.dData);
            }
            forQ = forQ.next;
        }

        return r;
    }

    public int size(){
        int d=0;
        Link current = first; // От начала списка
        while(current != null) // Перемещение до конца списка
        {
            d++;
            current = current.next;  // Вывод данны
        }
        return d;
    }
}

// -7x^6-4x^4+x+2
// 6x^3+2x^2-x-9