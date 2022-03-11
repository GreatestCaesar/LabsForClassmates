package laba_11;

import java.util.InputMismatchException;
import java.util.Scanner;

import MyException.MyException;
import ferry.Ferry;
import laba_12.Encryption;
import shipp.Ship;

public class laba_6 {
	public static void main(String[] args) throws MyException {
		int choice=5;
		boolean k=true;



		while (k) {
			System.out.println("Выберите необходимый транспорт:");
			System.out.println("1.Корабль");
			System.out.println("2.Паром");
			System.out.println("3.Шифр Плейфера");
			System.out.println("0.Выход");
			System.out.println("Введите соответствующую цифру.");
			System.out.println();


			Scanner scan = new Scanner(System.in);
			try {                                                    // нахождение ошибки на ввод не текста, но программа прдолжает работать
				choice = scan.nextInt();
			}catch (Exception e){
				System.out.printf("Ошибка " + e.toString());
			}
			switch (choice) {
				case 1:
					Ship S = new Ship();
					Object[] input = S.Input();
					S.setQuantity((Integer) input[0]);
					S.setPrice((Double) input[1]);
					S.setDay((Integer) input[2]);
					S.setPayback((Integer) input[3]);
					S.Cost(S.getQuantity(), S.getPayback());
					S.Cost(S.getQuantity(), S.getPrice());
					S.Definition(S.getPayback(), S.getCost());
					S.Definition(S.contry);
					S.Oneday(S.getDay(), S.getPrice());
					S.Oneday(S.year);
					S.Ear(S.getDay());


					S.Cost(S.getQuantity(), S.getPrice());

					break;
				case 2:
					Ferry P = new Ferry();
					Object[] input2 = P.Input();
					P.setQuantity((Integer) input2[0]);
					P.setPrice((Double) input2[1]);
					P.setDay((Integer) input2[2]);
					P.setPayback((Integer) input2[3]);
					P.setMass((Double) input2[4]);
					P.Mes(P.getQuantity(), P.getPayback());
					P.Mas(P.getQuantity(), P.getMesto());
					P.Mas(1, 5, 5);
					P.Sca(5, 5, 4, 7);
					P.Ear(5, 5, 4, 7);
					P.Cost(P.getQuantity(), P.getPrice());
					break;

				case 3: {
					Encryption e = new Encryption();
					try {
						e.enc();
					}catch (MyException z){
						System.out.println(z);
					}
				}
				case 0: {
					k = false;
					break;
				}
				default: {
					System.out.println("\nПовторите ввод");
					break;
				}


			}
		}
	}
}