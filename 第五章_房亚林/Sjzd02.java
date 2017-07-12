package homework_Chapter05;

import java.util.Scanner;

public class Sjzd02 {
	public static void main(String[] args){
		System.out.println("MyShopping管理系统 > 购物结算\n\n ");
		System.out.println("********************************\n");
		System.out.println("请选购买的商品编号：");
		System.out.println("1.T 恤\t2.网球鞋\t3.网球拍");
		System.out.println("*********************************\n");
		Scanner input = new Scanner(System.in);
		double price = 0;;
		String name = "";
		String answer = "y";
		while("y".equals(answer)){
			System.out.println("请输入商品编号：");
			int num = input.nextInt();
			switch(num){
				case 1:
					name = "T 恤";
					price = 245.0;
					break;
				case 2:
					name = "网球鞋";
					price = 570.0;
					break;
				case 3:
					name = "网球拍";
					price = 320.0;
					break;
			}
			System.out.println(name + "\t" + "￥" + price +"\n");
			System.out.println("是否继续（y/n)");
			answer = input.next();
		}
		System.out.println("程序结束！");
	}
}
