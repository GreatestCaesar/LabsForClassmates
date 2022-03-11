package Main;

import Cipher.*;
import MyException.MyException;
import Read.Read;
import Threads.SynchDec;
import Web.Web;
import Site.Site;
import Browser.Browser;
import Write.Write;

import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws MyException, IOException {
        String[] fields;
        Read read = new Read();
        Scanner s = new Scanner(System.in);
        int n=0;
        Web ex = new Web();
        fields = read.read(ex,"C:\\Users\\Julius\\IdeaProjects\\Nik17\\Web\\web.txt");
        Web web = new Web(fields[0], Integer.parseInt(fields[1]), fields[2]);
        System.out.println(web);
        web.update();
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        Site ex1 = new Site();
        fields = read.read(ex1,"C:\\Users\\Julius\\IdeaProjects\\Nik17\\Site\\site.txt");
        Site site = new Site(fields[0], Integer.parseInt(fields[1]), Integer.parseInt(fields[2]), fields[3]);
        System.out.println(site);
        site.update();
        if( site.data(500)){
            System.out.println("Сможет обработать");
        }else{
            System.out.println("Возникнут проблемы");
        }
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        Browser ex2 = new Browser();
        fields = read.read(ex2, "C:\\Users\\Julius\\IdeaProjects\\Nik17\\Browser\\browser.txt");
        Browser browser = new Browser(fields[0], Integer.parseInt(fields[1]), Integer.parseInt(fields[2]), fields[3]);
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
