package homework_Chapter05;

import java.util.Scanner;

public class Sjlx04 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("��ӭʹ��MyShopping����ϵͳ\n\n");
		System.out.println("*****************************\n");
		System.out.println("\t1.�ͻ���Ϣ����");
		System.out.println("\t2.�������");
		System.out.println("\t3.�������");
		System.out.println("\t4.ע��");
		System.out.println("******************************\n\n");
		boolean isRight = true;
		do{
			System.out.print("��ѡ���������֣�");
			int number = input.nextInt();
			switch(number){
				case 1:
					System.out.println("1.�ͻ���Ϣ����");
					isRight = false;
					break;
				case 2:
					System.out.println("2.�������");
					isRight = false;
					break;
				case 3:
					System.out.println("3.�������");
					isRight = false;
					break;
				case 4:
					System.out.println("4.ע��");
					isRight = false;
					break;
				default:
					System.out.println("�����������������");
					isRight = true;
					break;
			}
		}while(isRight);
		if(!isRight){
			System.out.println("\n\n���������");
		}
	}

}
