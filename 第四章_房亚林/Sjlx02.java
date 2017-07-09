package homework7_8;

import java.util.Scanner;

public class Sjlx02 {
	public static void main(String[] args){
		System.out.println("请输入消费金额：");
		Scanner input = new Scanner(System.in);
		double money = input.nextDouble();
		System.out.println("是否参加优惠活动？（是/否）：");
		String judge = input.next();
		if(judge.contentEquals("是")){
			System.out.println("1：满50元，加2元换购百事可乐饮料一瓶。");
			System.out.println("2：满100元，加3元换购500ml可乐一瓶。");
			System.out.println("3：满100元，加10元换购5kg面粉。");
			System.out.println("4：满200元，加10元可换购一个苏泊尔炒菜锅。");
			System.out.println("5：满200元，加20元可换购欧莱雅爽肤水一瓶。");
			System.out.println("0：不换购");
			System.out.println("请选择：");
			int num = input.nextInt();
			switch(num){
				case 0:
					System.out.println("本次消费金额为："+money);
					System.out.println("谢谢您的光临！");
					break;
				case 1:
					money = money + 2;
					System.out.println("本次消费总金额："+money);
					System.out.println("成功换购：百事可乐一瓶");
					break;
				case 2:
					money = money + 3;
					System.out.println("本次消费总金额："+money);
					System.out.println("成功换购：500ml可乐一瓶");
					break;
				case 3:
					money = money + 10;
					System.out.println("本次消费总金额："+money);
					System.out.println("成功换购：5kg面粉");
					break;
				case 4:
					money = money + 10;
					System.out.println("本次消费总金额："+money);
					System.out.println("成功换购：一个苏泊尔炒菜锅");
					break;
				case 5:
					money = money + 20;
					System.out.println("本次消费总金额："+money);
					System.out.println("成功换购：欧莱雅爽肤水一瓶");
					break;
			}
		}
		else{
			System.out.println("本次消费金额："+money);
			System.out.println("欢迎你的光临！");
		}
	}
}
