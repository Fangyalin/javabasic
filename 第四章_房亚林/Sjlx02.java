package homework7_8;

import java.util.Scanner;

public class Sjlx02 {
	public static void main(String[] args){
		System.out.println("���������ѽ�");
		Scanner input = new Scanner(System.in);
		double money = input.nextDouble();
		System.out.println("�Ƿ�μ��Żݻ������/�񣩣�");
		String judge = input.next();
		if(judge.contentEquals("��")){
			System.out.println("1����50Ԫ����2Ԫ�������¿�������һƿ��");
			System.out.println("2����100Ԫ����3Ԫ����500ml����һƿ��");
			System.out.println("3����100Ԫ����10Ԫ����5kg��ۡ�");
			System.out.println("4����200Ԫ����10Ԫ�ɻ���һ���ղ������˹���");
			System.out.println("5����200Ԫ����20Ԫ�ɻ���ŷ����ˬ��ˮһƿ��");
			System.out.println("0��������");
			System.out.println("��ѡ��");
			int num = input.nextInt();
			switch(num){
				case 0:
					System.out.println("�������ѽ��Ϊ��"+money);
					System.out.println("лл���Ĺ��٣�");
					break;
				case 1:
					money = money + 2;
					System.out.println("���������ܽ�"+money);
					System.out.println("�ɹ����������¿���һƿ");
					break;
				case 2:
					money = money + 3;
					System.out.println("���������ܽ�"+money);
					System.out.println("�ɹ�������500ml����һƿ");
					break;
				case 3:
					money = money + 10;
					System.out.println("���������ܽ�"+money);
					System.out.println("�ɹ�������5kg���");
					break;
				case 4:
					money = money + 10;
					System.out.println("���������ܽ�"+money);
					System.out.println("�ɹ�������һ���ղ������˹�");
					break;
				case 5:
					money = money + 20;
					System.out.println("���������ܽ�"+money);
					System.out.println("�ɹ�������ŷ����ˬ��ˮһƿ");
					break;
			}
		}
		else{
			System.out.println("�������ѽ�"+money);
			System.out.println("��ӭ��Ĺ��٣�");
		}
	}
}
