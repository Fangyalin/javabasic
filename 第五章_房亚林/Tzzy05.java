package homework_Chapter05;

import java.util.Scanner;

public class Tzzy05 {
	public static void main(String[] args){
		/*
		 * ����һ�����������������ĸ�λ���ҷ�ת�����������123�����321��
		 * */
		Scanner input = new Scanner(System.in);
		System.out.println("������һ����������");
		int x = input.nextInt();
		int s = 0;
		while(x>0){
			s = s*10 + x%10;
			x = x / 10;
		}
		System.out.println(s);
	}
}
