package Task2;

import java.util.ArrayList;
import java.util.Scanner;

public class Bank {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        Client client = new Client("Семён",23,1,null);
        Score score = new Score(2312342,54000,0.3,false);
        ArrayList<Score> scores = new ArrayList<>();
        boolean k = true;
        char l;
        while (k) {
            System.out.println("1. Открыть новый счёт\t2. Просмотреть счета\t3. Данные о пользователе\t4. Заблокировать/разблокировать счёт\n5. Сортировка\t6. Сумма счетов\t0. Выход");
            l = scanner.nextLine().charAt(0);
            switch (l){
                case '1':{
                    scores = client.open(scores);
                    break;
                }
                case '2':{
                    if(scores.isEmpty()){
                        System.out.println("У вас нет счетов!");
                    }else{
                        for(int i=0;i<scores.size();i++){
                            System.out.println("\n_______________________________________________________________________________");
                            System.out.print("| Номер - " + scores.get(i).getId());
                            System.out.print("\n| Сумма - " + scores.get(i).getSum());
                            System.out.print("\n| Процент - " + scores.get(i).getPercent());
                            System.out.print("\n| Блокирова - " + scores.get(i).isLocked());
                            System.out.println("\n_______________________________________________________________________________");
                        }
                    }
                    break;
                }
                case '3':{
                    System.out.println(client);
                    break;
                }
                case '4':{
                    scores = client.block(scores);
                    break;
                }
                case '5':{
                    scores = client.sort(scores);
                    break;
                }
                case '6':{
                    boolean p = true;
                    char w;
                    while(p) {
                        System.out.println("1. Всех счетов\t2. Положительных\t3. Отрицательных\t0. Назад");
                        w = scanner.nextLine().charAt(0);
                        switch (w){
                            case '1':{
                                client.sumall(scores);
                                break;
                            }
                            case '2':{
                                client.positsum(scores);
                                break;
                            }
                            case '3':{
                                client.negatsum(scores);
                                break;
                            }
                            case '0':{
                                p = false;
                                break;
                            }
                        }
                    }
                    break;
                }
                case '0':{
                    k=false;
                    break;
                }
                default:{
                    System.out.println("Повторите ввод");
                    break;
                }
            }
        }
    }
}
