package homework7_7;

import java.util.Scanner;

public class Sjlx03 {
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		System.out.println("�������Ƿ��ǻ�Ա���ǣ�y��/�������ַ���");
		String i = input.next();
		if(i.contentEquals("y")){
			System.out.println("�����빺���");
			double money = input.nextDouble();
			if(money>=100&&money<200){
				money = money * 0.8;
				System.out.println("ʵ��֧����"+ money);
			}
			else{
				money = money * 0.75;
				System.out.println("ʵ��֧����"+ money);
			}
		}
		else{
			System.out.println("�����빺���");
			double money = input.nextDouble();
			if(money>=100){
				money = money * 0.9;
				System.out.println("ʵ��֧����"+ money);
			}
		}
	}
}
