package homework_Chapter05;

import java.util.Scanner;

public class Sjlx03 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("��ѡ������Ʒ���");
		System.out.println("1.T ��\t2.����Ь\t3.������");
		System.out.println("****************************\n\n");
		String answer = "y";
		double price = 0.0, sum = 0.0;
		double total = 0;
		String name = "";
		while("y".equals(answer)){
			System.out.println("��������Ʒ��ţ�");
			int number = input.nextInt();
			System.out.println("�����빺��������");
			int number2 = input.nextInt();
			switch(number){
				case 1:
					price = 245.0;
					sum = price * number2;
					name = "T ��";
					System.out.println(name+"��"+price+"\t����"+number2+"\t�ϼƣ�"+sum);
					break;
				case 2:
					price = 570.0;
					sum = price * number2;
					name = "����Ь";
					System.out.println(name+"��"+price+"\t����"+number2+"\t�ϼƣ�"+sum);
					break;
				case 3:
					price = 320.0;
					sum = price * number2;
					name = "������";
					System.out.println(name+"��"+price+"\t����"+number2+"\t�ϼƣ�"+sum);
					break;
			}
			total += sum;
			System.out.println("�Ƿ������y/n����");
			answer = input.next();
		}
		double discount = 0.8;
		double payment = 0.0;
		System.out.println("�ۿۣ�"+ discount);
		System.out.println("Ӧ�����"+total * discount);
		System.out.print("ʵ����");
		payment = input.nextDouble();
		System.out.println("��Ǯ��"+(payment-total*discount));
	}
}
