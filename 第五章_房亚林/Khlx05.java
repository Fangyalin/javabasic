package homework_Chapter05;

import java.util.Scanner;

public class Khlx05 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int i = 0;
		do{
			System.out.println("������һ������1~7������0��������");
			i = input.nextInt();
			if(i!=0){
				if(i<=7&&i>0)
				switch(i){
					case 1:
						System.out.println("������MON");
						break;
					case 2:
						System.out.println("������TUE");
						break;
					case 3:
						System.out.println("������WED");
						break;
					case 4:
						System.out.println("������THU");
						break;
					case 5:
						System.out.println("������FRI");
						break;
					case 6:
						System.out.println("������SAT");
						break;
					case 7:
						System.out.println("������SUM");
						break;
				}
				else{
					System.out.println("����������������룺");
					break;
				}
			}
		}while(i!=0);
		System.out.println("���������");
	}

}
