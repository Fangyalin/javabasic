package homework7_8;

import java.util.Scanner;

public class Khlx04 {
	public static void main(String[] args){
		double money = 5000;
		System.out.println("请选择仓位（1头等舱2经济舱）:");
		Scanner input = new Scanner(System.in);
		int num = input.nextInt();
		if(num == 1){
			System.out.println("请输入月份：");
			int month = input.nextInt();
			switch(month){
				case 1:
				case 2:
				case 3:
				case 11:
				case 12:
					money = money * 0.5;
					System.out.println("您的票价为："+ money);
					break;
				case 4:
				case 5:
				case 6:
				case 7:
				case 8:
				case 9:
				case 10:
					money = money * 0.9;
					System.out.println("您的票价为："+ money);
					break;
				default:
					System.out.println("输入有误！");
					break;
			}
		}
		else if(num == 2){
			System.out.println("请输入月份：");
			int month = input.nextInt();
			switch(month){
				case 1:
				case 2:
				case 3:
				case 11:
				case 12:
					money = money * 0.4;
					System.out.println("您的票价为："+ money);
					break;
				case 4:
				case 5:
				case 6:
				case 7:
				case 8:
				case 9:
				case 10:
					money = money * 0.8;
					System.out.println("您的票价为："+ money);
					break;
				default:
					System.out.println("输入有误！");
					break;
			}
		}
		else{
			System.out.println("输入有误！");
		}
	}
}
