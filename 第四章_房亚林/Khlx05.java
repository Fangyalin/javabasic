package homework7_8;

import java.util.Scanner;

public class Khlx05 {

	public static void main(String[] args) {
		System.out.println("�������һ������");
		Scanner input = new Scanner(System.in);
		double number1 = input.nextInt();
		System.out.println("�������������+��-��*��/��%����");
		char opr = input.next().charAt(0);
		System.out.println("������ڶ�������");
		double number2 = input.nextInt();
		double result = 0.0;
		switch(opr){
			case '+':
				result = number1 + number2;
				break;
			case '-':
				result = number1 - number2;
				break;
			case '*':
				result = number1 * number2;
				break;
			case '/':
				if(number2 == 0){
					System.out.println("��������ȷ�Ĳ�������");
				}
				else{
					result = number1 / number2;
				}
				break;
			case '%':
				if(number2 == 0){
					System.out.println("��������ȷ�Ĳ�������");
				}
				else{
					result = number1 % number2;
				}
				break;
			default:
				break;
			
		}
		System.out.printf("������Ϊ��%.2f %c %.2f = %.2f\n",number1, opr, number2, result);
		
	}

}
