package homework7_8;

import java.util.Scanner;

public class Khlx03 {
	public static void main(String[] args){
		System.out.println("������ɼ���");
		Scanner input = new Scanner(System.in);
		int score = input.nextInt();
		switch(score/10){
			case 10:
				System.out.println("���׸�����һ������");
				break;
			case 9:
				System.out.println("ĸ�׸�����һ���ʼǱ�����");
				break;
			case 8:
			case 7:
			case 6:
				System.out.println("ĸ�׸�����һ���ֻ�");
				break;
			case 5:
			case 4:
			case 3:
			case 2:
			case 1:
			case 0:
				System.out.println("û������");
				break;
			default:
				System.out.println("��������ȷ�ɼ���");
				break;
		}
	}
}
