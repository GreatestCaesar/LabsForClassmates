package ferry;

import java.util.Scanner;
public class Ferry extends SeaTransport{

	private	double mesto;
	protected double mass;
		
	
	public Ferry() {
		super();
		this.mass = mass;
		this.mesto = mesto;
	}
	
		
			public void setMass(double mass)
			{ 
			this.mass = mass;	
			}
			public double getMass()
			{ 
			return this.mass;	
			}
			public double getMesto() {
				return mesto;
			}

			public void setMesto(double mesto) {
				this.mesto = mesto;
			}
			
			
			@Override
			public Object[] Input() {
				
					System.out.println("����� ");
					Object [] input2=new Object[5];
					Scanner scan = new Scanner(System.in);
					System.out.print("������� ���������� �������: ");
					input2[0] = scan.nextInt();
					System.out.print("������� ���� �� ���������� �����: ");
					input2[1] = scan.nextDouble();
					System.out.print("������� ��� � ����: ");
					input2[2] = scan.nextInt();
					System.out.print("���������� �������� �������: ");	
					input2[3] = scan.nextInt();
					System.out.print("������� ����� ����� �� �����: ");	
					input2[4] = scan.nextDouble();
					return input2;
					}
			


			public double Mes(int quantity, double mass) {
				double mes;
				mes=mass/quantity;
				System.out.println("������� ��� ������ ������ ��������:"+ mes);
				return mes;
			}
			public double Mes(int quantity, int payback) {
				double cd;
				setMesto((quantity-payback));
				System.out.println("�������� ��������� ����:"+ getMesto());
				return getMesto();
			}
			public void Mas (int quantity, double mesto) {
				if(quantity<=mesto) {
					System.out.println ("�������� ������� ������, ��� ��������� ����");
				}
				else {
					System.out.println ("�������� ������� ������, ��� ��������� ����");
				}	
			}
				public void Mas ( double mass) {
					if(mass<7000) {
						System.out.println ("����� ����� �� ��������� ����������������");
					}
					else {
						System.out.println ("����� ����� ��������� ����������������");
			}
			}
				public void Mas(int ... deck) {
					int sum=0;
					System.out.println("���������� �����: "+deck.length );
					
					for(int i = 0; i < deck.length; i++) {
			            sum=sum+deck[i];
			        }
					
					System.out.println("����� ���������� ���� �� ������: " +sum);
			} 

				public  void Sca(int ... sca) {
					
					for(int i = 0; i < sca.length; i++) {
		
			        }
					System.out.println("C������ ����� ��������� �������:  "+ sca.length );
					
				}
				public  void Ear(int ... scaner) {
					int sum=0;
					for(int i = 0; i < scaner.length; i++) {
			            sum=sum+scaner.length;
			        }
					System.out.println("���������� �������: "+sum );
				}

				@Override
				public double Cost(int quantity, double price) {
					return super.Cost(quantity, price);
				}

			
				
}
