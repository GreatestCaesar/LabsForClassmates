package Hash;

class HashTable
{
    private LinkList[] hashArray; // Массив ячеек хеш-таблицы
    private int arraySize;
    // -------------------------------------------------------------
    public HashTable(int size) // Конструктор
    {
        arraySize = size;
        hashArray = new LinkList[arraySize];
        for(int i=0;i<hashArray.length;i++){
            hashArray[i] = new LinkList();
        }
    }
    // -------------------------------------------------------------
    public void displayTable()
    {
        System.out.print("Таблица: ");
        for(int j=0; j<arraySize; j++)
        {
            if(hashArray[j] != null)
                hashArray[j].displayList();
            else
                System.out.print("** ");
        }
        System.out.println("");
    }
    // -------------------------------------------------------------
    public int hashFunc(String word)
    {
        int k = word.length();
        char[] alp = {'а','б','в','г','д','е','ё','ж','з','и','й','к','л','м','н','о','п','р','с','т','у','ф','х','ц','ч','ш','щ','ъ','ы','ь','э','ю','я',' '};
        int key = 0;
        for(int i=0;i<word.length();i++){
            for(int j=0;j < alp.length;j++){
                if(word.charAt(i)==alp[j]){
                    key += (j+1) * Math.pow(alp.length,k);
                    k--;
                }
            }
        }
        return (key % arraySize); // Хеш-функция
    }
    // -------------------------------------------------------------
    public void insert(Link newLink) // Вставка элемента данных
    // (Метод предполагает, что таблица не заполнена)
    {
        int hashVal = hashFunc(newLink.getWord()); // Хеширование ключа
        // Пока не будет найдена
        while(!hashArray[hashVal].isEmpty() && hashFunc(hashArray[hashVal].displayFirst().getWord()) != hashVal)
        {
            ++hashVal; // Переход к следующей ячейке
            hashVal %= arraySize; // При достижении конца таблицы
        } // происходит возврат к началу
        hashArray[hashVal].insert(newLink); // Вставка элемента
    }
    // -------------------------------------------------------------
    public Link delete(String word) // Удаление элемента данных
    {
        int hashVal = hashFunc(word); // Хеширование ключа
        while(!hashArray[hashVal].isEmpty()) // Пока не будет найдена
        // пустая ячейка
        { // Ключ найден?
            if(hashArray[hashVal].find(word) != null) {
                return hashArray[hashVal].delete(word);
            }
            ++hashVal; // Переход к следующей ячейке
            hashVal %= arraySize; // При достижении конца таблицы
        } // происходит возврат к началу
        return null; // Элемент не найден
    }
// -------------------------------------------------------------
    public Link find(String word) // Поиск элемента с заданным ключом
    // (Метод предполагает, что таблица не заполнена)
    {
        int hashVal = hashFunc(word); // Хеширование ключа
        while(!hashArray[hashVal].isEmpty()) // Пока не будет найдена
        // пустая ячейка
        { // Ключ найден?
            if(hashArray[hashVal].find(word) != null)
                return  hashArray[hashVal].find(word);
            ++hashVal; // Переход к следующей ячейке
            hashVal %= arraySize; // При достижении конца таблицы
        } // происходит возврат к началу
        return null; // Элемент не найден
    }
// -------------------------------------------------------------
} // Конец класса HashTable
////////////////////////////////////////////////////////////////