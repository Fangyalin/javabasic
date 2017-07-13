package homework_Chapter06;

import java.util.Scanner;

public class Sjlx03 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("MyShopping管理系统> 客户信息管理> 添加客户信息\n\n");
		for(int i = 0; i < 3; i ++){
			System.out.print("请输入会员号(<4位数字>):");
			int custNo = input.nextInt();
			if(custNo > 999 && custNo < 10000){
				System.out.print("请输入会员生日：");
				String birthday = input.next();
				System.out.print("请输入会员积分：");
				int points = input.nextInt();
				System.out.println("你录入的会员信息是：\n"+ custNo +"\t"+ birthday +"\t"+ points+"\n\n");
			}
			else{
				System.out.println("输入错误！");
			}
		}
		System.out.println("程序结束！");
	}

}
