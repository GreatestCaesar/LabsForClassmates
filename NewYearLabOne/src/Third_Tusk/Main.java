package Third_Tusk;

import java.util.Scanner;

public class Main
{
    public static void main(String[] args) {
        LinkList list = new LinkList();
        Scanner scanner = new Scanner(System.in);
        boolean l = true, k = true, t = true;
        String surname = "", number = "";
        int n=0;
        do {
            t = true;
            System.out.println("Добавить абонента? 1. Да 2. Нет");
            n = scanner.nextInt();
            if (n == 1) {
                do {
                    l = true;
                    System.out.println("Введите фамилию абонента: ");
                    scanner.nextLine();
                    surname = scanner.nextLine();
                    if (numb(surname)) {
                        System.out.println("В фамилии - цифра");
                        l = false;
                    } else {
                        do {
                            k = true;
                            System.out.println("Введите номер телефона. Пример - (33)-35-36-836");
                            number = scanner.nextLine();
                            if (!number.matches("\\((33|29|44|25)\\b\\)\\-[1-9]{2}\\-[0-9]{2}\\-[0-9]{3}")) {
                                System.out.println("Неверный номер телефона");
                                k = false;
                            }
                        } while (!k);
                    }
                } while (!l);
                list.sortInsert(surname, number);
                t = false;
            } else if (n == 2) {
                t = true;
            }
        } while (!t);


        list.displayList();

        n=0;
        surname = "";
        number = "";
        do
            {
                l = true;
                System.out.println("1. Найти номера телефонов по фамилии 2. Найти фамилии по номеру телефона 3. Выход");
                n = scanner.nextInt();
                if(n==1)
                {
                    do
                        {
                            k=true;
                            System.out.println("Введите фамилию: ");
                            scanner.nextLine();
                            surname = scanner.nextLine();
                            if (numb(surname)) {
                                System.out.println("В фамилии - цифра");
                                k = false;
                            }else{
                                list.find_sur(surname);
                                l = false;
                            }
                        }while(!k);
                }
                else if(n==2)
                {
                    do
                        {
                            k = true;
                            System.out.println("Введите номер телефона. Пример - (33)-35-36-836");
                            scanner.nextLine();
                            number = scanner.nextLine();
                            if (!number.matches("\\((33|29|44|25)\\b\\)\\-[1-9]{2}\\-[0-9]{2}\\-[0-9]{3}")) {
                                System.out.println("Неверный номер телефона");
                                k = false;
                            }else{
                                list.find_numb(number);
                                l = false;
                            }
                        }while (!k);
                }
            } while (!l);
    }

    public static boolean numb(String text){
        for(int i=0;i<text.length();i++){
            if(Character.isDigit(text.charAt(i))){
                return true;
            }
        }
        return false;
    }
}

/*
{Соломонов, (33)-32-13-287}
{Гисич, (33)-63-22-179}
{Смирнов, (33)-35-36-836}
{Пилющенко, (33)-32-13-287}
{Гисич, (33)-35-36-836}
 */
