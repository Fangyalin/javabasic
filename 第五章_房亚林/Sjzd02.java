package homework_Chapter05;

import java.util.Scanner;

public class Sjzd02 {
	public static void main(String[] args){
		System.out.println("MyShopping����ϵͳ > �������\n\n ");
		System.out.println("********************************\n");
		System.out.println("��ѡ�������Ʒ��ţ�");
		System.out.println("1.T ��\t2.����Ь\t3.������");
		System.out.println("*********************************\n");
		Scanner input = new Scanner(System.in);
		double price = 0;;
		String name = "";
		String answer = "y";
		while("y".equals(answer)){
			System.out.println("��������Ʒ��ţ�");
			int num = input.nextInt();
			switch(num){
				case 1:
					name = "T ��";
					price = 245.0;
					break;
				case 2:
					name = "����Ь";
					price = 570.0;
					break;
				case 3:
					name = "������";
					price = 320.0;
					break;
			}
			System.out.println(name + "\t" + "��" + price +"\n");
			System.out.println("�Ƿ������y/n)");
			answer = input.next();
		}
		System.out.println("���������");
	}
}
