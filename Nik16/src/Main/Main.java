package Main;

import Cipher.*;
import MyException.MyException;
import Threads.SynchDec;
import Web.Web;
import Site.Site;
import Browser.Browser;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws MyException {
        Scanner s = new Scanner(System.in);
        int n=0;
        Web web = new Web("Мониторинг диких животных",2019,"BSAC");
        System.out.println(web);
        web.update();
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        Site site = new Site("animal.by",2020,23,"PHP");
        System.out.println(site);
        site.update();
        try {
            System.out.println("Введите кол-во отправляемых запросов: ");
            n = s.nextInt();
        }catch (Exception e){
            System.out.println("Ошибка - " + e);
            System.out.println("Выход");
            System.exit(0);
        }
        if( site.data(n)){
            System.out.println("Сможет обработать");
        }else{
            System.out.println("Возникнут проблемы");
        }
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        Browser browser = new Browser("Атом",2500000,"Java",2020);
        System.out.println(browser);
        browser.update();
        try {
            System.out.println("Введите кол-во отправляемых запросов: ");
            n = s.nextInt();
        }catch (Exception e){
            System.out.println("Ошибка - " + e);
        }
        if( site.data(n)){
            System.out.println("Сможет обработать");
        }else{
            System.out.println("Возникнут проблемы");
        }
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        Cipher c = new Cipher();
        Decryptyon d = new Decryptyon();
        new SynchDec(d);
        new SynchDec(d);
    }
}
