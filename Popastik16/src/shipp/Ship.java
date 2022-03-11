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

	public void work(){
		Object[] input = Input();
		setQuantity((Integer) input[0]);
		setPrice((Double) input[1]);
		setDay((Integer) input[2]);
		setPayback((Integer) input[3]);
		Cost(getQuantity(), getPayback());
		Cost(getQuantity(), getPrice());
		Definition(getPayback(), getCost());
		Definition(contry);
		Oneday(getDay(), getPrice());
		Oneday(year);
		Ear(getDay());


		Cost(getQuantity(), getPrice());
	}

	@Override
	public Object[] Input() {
		Object [] input=new Object[4];
		System.out.println("������� ");
		Scanner scan = new Scanner(System.in);
		System.out.print("������� ���������� ���������� ����: ");
		try {
			input[0] = scan.nextInt();
			System.out.print("������� ���� �� ���������� �����: ");
			input[1] = scan.nextDouble();
			System.out.print("������� ��� � ����: ");
			input[2] = scan.nextInt();
			System.out.print("������� ���������� �������� �������: ");
			input[3] = scan.nextInt();
		}catch (Exception e)       																				// ���������� � ����������� ������
		{
			System.out.println("������! ����� ������� ������\n" + e.toString());
			System.exit(0);
		}
		System.out.println();
		return input;
			}

	

	@Override
	public double Cost(int quantity, int payback) {
		double mesto;
		mesto=quantity-payback;
		System.out.println("�������� ��������� ����:"+ mesto);
		return mesto;
	
	}

	@Override
	public void Definition(String contry) {
		
		System.out.println("�� ������� �" + contry);
		
	}

	@Override
	public void Definition(int payback, double cost) {
		if(cost>=1000) {
			System.out.println ("����������� �������");
		}
		else {
			System.out.println ("�����������  ������������ ���������");
		}
	}

	

	@Override
	public double Oneday(int day, double price) {
		double  oneday ;
		oneday=price/day;
		System.out.println("���� ���� �������� �����:"+ oneday);
		return oneday;
	}
	
	@Override
	public double Oneday(int year) {
		double  one ;
		one=2020-year;
		System.out.println("������ ��������� � ��������:"+ one + "����/���");
		return one;
	}

	@Override
	public void Ear(int day) {
		if(day<=6) {
			System.out.println ("����������� ������ ������ 5 ����");
		}
		else {
			System.out.println ("����������� ������ ������ 5 ����");
		}
	}

	@Override
	public void Ear(int year, int quantity) {
		if(year>=2000) {
			System.out.println ("������ ������������");
		}
		else {
			System.out.println ("������ ��������������");
		}
		
	}

	@Override
	public double Cost(int quantity, double price) {
		double cost;
		cost=price*quantity;
		System.out.println("������� �� �������� �����:"+ cost);
		return cost;
	}
	

}
