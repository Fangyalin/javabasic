package homework7_8;

import java.util.Scanner;

public class Sjlx01 {
	public static void main(String[] args){
		System.out.println("\n\t\t欢迎使用我行我素购物管理系统1.0版\n");
		System.out.println("\t\t\t1.登录系统\n");
		System.out.println("\t\t\t2.退出\n");
		System.out.println("************************************************\n");
		System.out.println("请选择，输入数字：");
		Scanner input = new Scanner(System.in);
		int num = input.nextInt();
		switch(num){
			case 1:
				System.out.println("\n\t\t欢迎使用我行我素购物管理系统1.0版\n");
				System.out.println("***********************************************\n");
				System.out.println("\t\t\t1.客户信息管理\n");
				System.out.println("\t\t\t2.购物结算\n");
				System.out.println("\t\t\t3.真情回馈");
				System.out.println("\t\t\t4.注销\n");
				System.out.println("************************************************\n");
				System.out.println("请选择，输入数字：");
				break;
			case 2:
				System.out.println("谢谢您的使用!");
				break;
			default:
				System.out.println("输入错误");
				break;
		}
	}
}
