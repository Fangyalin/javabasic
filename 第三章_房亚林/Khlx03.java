package homework7_7;

import java.util.Scanner;

public class Khlx03 {
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		System.out.println("�������һ������");
		int a = input.nextInt();
		System.out.println("������ڶ�������");
		int b = input.nextInt();
		System.out.println("���������������");
		int c = input.nextInt();
		int d = 0;
		if(a>b){
			d = b;
			b = a;
			a = d;
		}
		if(b>c){
			d = c;
			c = b;
			b = d;
		}
		if(a>b){
			d = b;
			b = a;
			a = d;
		}
		System.out.println(a+" "+" "+b+" "+" "+c);
	}
}
