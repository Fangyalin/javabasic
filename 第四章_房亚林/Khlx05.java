package homework7_8;

import java.util.Scanner;

public class Khlx05 {

	public static void main(String[] args) {
		System.out.println("请输入第一个数：");
		Scanner input = new Scanner(System.in);
		double number1 = input.nextInt();
		System.out.println("请输入运算符（+、-、*、/、%）：");
		char opr = input.next().charAt(0);
		System.out.println("请输入第二个数：");
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
					System.out.println("请输入正确的操作数！");
				}
				else{
					result = number1 / number2;
				}
				break;
			case '%':
				if(number2 == 0){
					System.out.println("请输入正确的操作数！");
				}
				else{
					result = number1 % number2;
				}
				break;
			default:
				break;
			
		}
		System.out.printf("计算结果为：%.2f %c %.2f = %.2f\n",number1, opr, number2, result);
		
	}

}
