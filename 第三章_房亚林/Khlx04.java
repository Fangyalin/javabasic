package homework7_7;

import java.util.Scanner;

public class Khlx04 {
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		System.out.println("������һ��������");
		int num = input.nextInt();
		if(num%3==0||num%5==0){
			System.out.println("��������3��5�ı�����");
		}
		else{
			System.out.println("�������ܱ�3��5�е��κ�һ����������");
		}
	}
}
