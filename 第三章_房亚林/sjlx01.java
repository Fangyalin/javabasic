package homework7_7;

import java.util.Scanner;

public class sjlx01 {
	public static void main(String[] args){
		int random = (int) (Math.random()*10);
		
		System.out.println("我行我素购物管理系统>幸运抽奖\n");
		System.out.println("请输入4位会员号：");
		Scanner input = new Scanner(System.in);
		int custNo = input.nextInt();
		int baiwei = custNo / 100 % 10;
		if(baiwei == random){
			System.out.println(custNo + "号客户是幸运客户，获精美MP3一个。");
		}
		else{
			System.out.println(custNo + "号客户，谢谢您的支持！");
		}
	}
}
