package homework7_7;

import java.util.Scanner;

public class Sjlx04 {
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		System.out.println("�������Ա���֣�");
		int integral = input.nextInt();
		if(integral<2000){
			System.out.println("�û�Ա���ܵ��ۿ��ǣ� 9��");
		}
		else if(integral>=2000&&integral<4000){
			System.out.println("�û�Ա���ܵ��ۿ��ǣ� 8��");
		}
		else if(integral>=4000&&integral<8000){
			System.out.println("�û�Ա���ܵ��ۿ��ǣ� 7��");
		}
		else{
			System.out.println("�û�Ա���ܵ��ۿ��ǣ� 6��");
		}
	}
}
