package Hash;

import java.io.IOException;
import java.util.Scanner;

class HashTableApp
{
    public static void main(String[] args) throws IOException
    {
        Scanner scanner = new Scanner(System.in);
        Link aDataItem;
        boolean m = true;
        int size, n;
        String word;
        // Ввод размеров
        System.out.print("Введите размер словаря: ");
        size = scanner.nextInt();
        do {
            System.out.print("Введите сколько изначально слов будет добавлено: ");
            n = scanner.nextInt();
            if(n>size){
                System.err.println("Превосходит размер словаря!");
                m=false;
            }
        }while (!m);
        // Создание таблицы
        HashTable theHashTable = new HashTable(size);
        for(int j=0; j<n; j++) // Вставка данных
        {
            System.out.println("Введите слово: ");
            word = scanner.next();
            aDataItem = new Link(word);
            theHashTable.insert(aDataItem);
        }
        while(true) // Взаимодействие с пользователем
        {
            System.out.print("Введите первую букву из ");
            System.out.print("показать, вставить, удалить, или найти: ");
            char choice = scanner.next().charAt(0);
            switch(choice)
            {
                case 'п':
                    theHashTable.displayTable();
                    break;
                case 'в':
                    System.out.print("Введите слово, которое желаете вставить: ");
                    scanner.nextLine();
                    word = scanner.nextLine();
                    aDataItem = new Link(word);
                    theHashTable.insert(aDataItem);
                    break;
                case 'у':
                    System.out.print("Введите слово, которое желаете удалить: ");
                    scanner.nextLine();
                    word = scanner.nextLine();
                    aDataItem = theHashTable.delete(word);
                    if(aDataItem != null)
                    {
                        System.out.println("Удалено " + aDataItem);
                    }
                    else
                        System.out.println("Не найдено " + word );
                    break;
                case 'н':
                    System.out.print("Введите слово, которое хотите найти: ");
                    scanner.nextLine();
                    word = scanner.nextLine();
                    aDataItem = theHashTable.find(word);
                    if(aDataItem != null)
                    {
                        System.out.println("Найдено " + aDataItem.getWord());
                    }
                    else
                        System.out.println("Не найдено " + word);
                    break;
                default:
                    System.out.print("Ошибка ввода\n");
            }
        }
    }
//--------------------------------------------------------------
}
