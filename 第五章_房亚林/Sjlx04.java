package homework_Chapter05;

import java.util.Scanner;

public class Sjlx04 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("欢迎使用MyShopping管理系统\n\n");
		System.out.println("*****************************\n");
		System.out.println("\t1.客户信息管理");
		System.out.println("\t2.购物结算");
		System.out.println("\t3.真情回馈");
		System.out.println("\t4.注销");
		System.out.println("******************************\n\n");
		boolean isRight = true;
		do{
			System.out.print("请选择输入数字：");
			int number = input.nextInt();
			switch(number){
				case 1:
					System.out.println("1.客户信息管理");
					isRight = false;
					break;
				case 2:
					System.out.println("2.购物结算");
					isRight = false;
					break;
				case 3:
					System.out.println("3.真情回馈");
					isRight = false;
					break;
				case 4:
					System.out.println("4.注销");
					isRight = false;
					break;
				default:
					System.out.println("输入错误，请重新输入");
					isRight = true;
					break;
			}
		}while(isRight);
		if(!isRight){
			System.out.println("\n\n程序结束！");
		}
	}

}
