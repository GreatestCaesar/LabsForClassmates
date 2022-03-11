package Main;

import Cipher.Cipher;
import Web.Web;
import Site.Site;
import Browser.Browser;

public class Main {
    public static void main(String[] args){
        Web web = new Web("Мониторинг диких животных",2019,"BSAC");
        System.out.println(web);
        web.update();
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        Site site = new Site("animal.by",2020,23,"PHP");
        System.out.println(site);
        site.update();
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        Browser browser = new Browser("Атом",2500000,"Java",2020);
        System.out.println(browser);
        browser.update(); 
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        Cipher c = new Cipher();
        c.enc();
    }
}
