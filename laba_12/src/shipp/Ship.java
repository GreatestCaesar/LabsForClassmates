package shipp;

import java.util.Scanner;

public class Ship implements Liner, Sailboat{
	
	 protected  int quantity; 
	 protected  double price;
	 protected  int day;
	 protected  int payback;
	 protected  double cost;
	 
	 
	 public Ship() {
			this.quantity = quantity;
			this.price = price;
			this.day = day;
			this.payback = payback;
			this.cost = cost;
		}
		 
	 
	
	public int getQuantity() {
		return quantity;
	}



	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}



	public double getPrice() {
		return price;
	}



	public void setPrice(double price) {
		this.price = price;
	}



	public int getDay() {
		return day;
	}



	public void setDay(int day) {
		this.day = day;
	}



	public int getPayback() {
		return payback;
	}



	public void setPayback(int payback) {
		this.payback = payback;
	}



	public double getCost() {
		return cost;
	}



	public void setCost(double cost) {
		this.cost = cost;
	}



	@Override
	public Object[] Input() {
		Object [] input=new Object[4];
		System.out.println("Корабль ");
		Scanner scan = new Scanner(System.in);
		System.out.print("Введите количество посадочных мест: ");
		input[0] = scan.nextInt();
		System.out.print("Введите цену за посадочное место: ");
		input[1] = scan.nextDouble();
		System.out.print("Введите дни в пути: ");
		input[2] = scan.nextInt();
		System.out.print("Введите количество проданых билетов: ");	
		input[3] = scan.nextInt();
		
		System.out.println();
		return input;
			}

	

	@Override
	public double Cost(int quantity, int payback) {
		double mesto;
		mesto=quantity-payback;
		System.out.println("Осталось свободных мест:"+ mesto);
		return mesto;
	
	}

	@Override
	public void Definition(String contry) {
		
		System.out.println("Вы плывете в" + contry);
		
	}

	@Override
	public void Definition(int payback, double cost) {
		if(cost>=1000) {
			System.out.println ("Путешествие дорогое");
		}
		else {
			System.out.println ("Путешествие  относительно недорогое");
		}
	}

	

	@Override
	public double Oneday(int day, double price) {
		double  oneday ;
		oneday=price/day;
		System.out.println("Один день плавания стоит:"+ oneday);
		return oneday;
	}
	
	@Override
	public double Oneday(int year) {
		double  one ;
		one=2020-year;
		System.out.println("Лайнер находится в плаваньи:"+ one + "года/лет");
		return one;
	}

	@Override
	public void Ear(int day) {
		if(day<=6) {
			System.out.println ("Путешествие длится меньше 5 дней");
		}
		else {
			System.out.println ("Путешествие длится больше 5 дней");
		}
	}

	@Override
	public void Ear(int year, int quantity) {
		if(year>=2000) {
			System.out.println ("Лайнер рентабельный");
		}
		else {
			System.out.println ("Лайнер нерентабельный");
		}
		
	}

	@Override
	public double Cost(int quantity, double price) {
		double cost;
		cost=price*quantity;
		System.out.println("Выручка за проданые места:"+ cost);
		return cost;
	}
	

}
