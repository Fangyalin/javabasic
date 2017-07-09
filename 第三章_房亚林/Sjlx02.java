package homework7_7;

import java.util.Scanner;

public class Sjlx02 {
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		System.out.println("请输入会员号：");
		int id = input.nextInt();
		if(id>999&&id<10000){
			System.out.println("请输入会员生日（月/日<用两位数表示>）：");
			String day = input.next();
			System.out.println("请输入积分:");
			int num = input.nextInt();
			System.out.println("\n\n已录入的会员信息是：");
			System.out.println(id+"\t"+day+"\t"+num+"\n");
		}
		else{
			System.out.println("信息录入失败");
		}
	}
}
