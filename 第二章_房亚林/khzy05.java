package homework7_5;

import java.util.Scanner;
public class khzy05 {
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		System.out.println("请输入本金：");
		double a = input.nextDouble();
		double a1 = a + (a*0.225*1);
		double a2 = a + (a*0.027*2);
		double a3 = a + (a*0.0324*3);
		double a4 = a + (a*0.036*5);
		
		System.out.println("本金为："+ a+ "\n");
		System.out.println("存取第一年后的本息是："+ a1+"\n");
		System.out.println("存取第二年后的本息是："+ a2+"\n");
		System.out.println("存取第三年后的本息是："+ a3+"\n");
		System.out.println("存取第五年后的本息是："+ a4+"\n");
	}
}
