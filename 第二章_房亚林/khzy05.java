package homework7_5;

import java.util.Scanner;
public class khzy05 {
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		System.out.println("�����뱾��");
		double a = input.nextDouble();
		double a1 = a + (a*0.225*1);
		double a2 = a + (a*0.027*2);
		double a3 = a + (a*0.0324*3);
		double a4 = a + (a*0.036*5);
		
		System.out.println("����Ϊ��"+ a+ "\n");
		System.out.println("��ȡ��һ���ı�Ϣ�ǣ�"+ a1+"\n");
		System.out.println("��ȡ�ڶ����ı�Ϣ�ǣ�"+ a2+"\n");
		System.out.println("��ȡ�������ı�Ϣ�ǣ�"+ a3+"\n");
		System.out.println("��ȡ�������ı�Ϣ�ǣ�"+ a4+"\n");
	}
}
