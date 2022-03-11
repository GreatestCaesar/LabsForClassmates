package Main;

import Cipher.*;
import MyException.MyException;
import Threads.SynchDec;
import Web.Web;
import Site.Site;
import Browser.Browser;
import Write.Write;

import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws MyException, IOException {
        Scanner s = new Scanner(System.in);
        int n=0;
        Web web = new Web("Животныe",2019,"BSAC");
        new Write("web","C:\\Users\\Julius\\IdeaProjects\\Nik17\\Web",web);  // до \Web нужно вставить свой путь на проект, куда будет создаваться папка
        System.out.println("Файл создан");
        System.out.println(web);
        web.update();
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        Site site = new Site("animal.by",2020,23,"PHP");
        new Write("site","C:\\Users\\Julius\\IdeaProjects\\Nik17\\Site",site); // также
        System.out.println("Файл создан");
        System.out.println(site);
        site.update();
        if( site.data(500)){
            System.out.println("Сможет обработать");
        }else{
            System.out.println("Возникнут проблемы");
        }
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        Browser browser = new Browser("Атом",2500000,"Java",2020);
        new Write("browser","C:\\Users\\Julius\\IdeaProjects\\Nik17\\Browser",browser);
        System.out.println("Файл создан");
        System.out.println(browser);
        browser.update();
        if( site.data(500)){
            System.out.println("Сможет обработать");
        }else{
            System.out.println("Возникнут проблемы");
        }
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        /*Cipher c = new Cipher();
        Decryptyon d = new Decryptyon();
        new SynchDec(d);
        new SynchDec(d);*/
    }
}
