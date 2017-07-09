package homework7_7;

import java.util.Scanner;

public class Sjlx03 {
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		System.out.println("请输入是否是会员：是（y）/否（其他字符）");
		String i = input.next();
		if(i.contentEquals("y")){
			System.out.println("请输入购物金额：");
			double money = input.nextDouble();
			if(money>=100&&money<200){
				money = money * 0.8;
				System.out.println("实际支付："+ money);
			}
			else{
				money = money * 0.75;
				System.out.println("实际支付："+ money);
			}
		}
		else{
			System.out.println("请输入购物金额：");
			double money = input.nextDouble();
			if(money>=100){
				money = money * 0.9;
				System.out.println("实际支付："+ money);
			}
		}
	}
}
