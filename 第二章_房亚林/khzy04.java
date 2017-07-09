package homework7_5;

import java.util.Scanner;
public class khzy04 {
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		System.out.println("请输入温度：");
		double f = input.nextDouble();
		double a = 5/9.0*(f-32);
		System.out.println("摄氏度是："+ a+ "\n华氏度是："+ f);
	}
}
