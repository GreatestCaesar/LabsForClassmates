package shipp;

import java.util.Scanner;

import java.lang.String;


public interface Liner {

    final int year=2005;

    public Object[] Input() ;
    public double Oneday(int day, double price) ;
    public double Oneday(int year) ;
    public void Ear (int day);
    public void Ear (int year, int quantity) ;
    public double Cost(int quantity, double price) ;
}
