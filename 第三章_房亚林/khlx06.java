package homework7_7;

import java.util.Scanner;

public class khlx06 {
	public static void main(String[] args){
		double price;
		Scanner input = new Scanner(System.in);
		System.out.println("请输入您出行的月份：");
		int mon = input.nextInt();
		if(mon>=4&&mon<=10){
			System.out.println("请输入你要坐的仓位：");
			String fs = input.next();
			if(fs.contentEquals("头等舱")){
				price = 5000 * 0.9;
			}
			else{
				price = 5000 * 0.8;
			}
		}
		else{
			System.out.println("请输入您要坐的仓位：");
			String fs = input.next();
			if(fs.contentEquals("头等舱")){
				price = 5000 * 0.5;
			}
			else{
				price = 5000 * 0.4;
			}
		}
		System.out.println("您的票价为："+price);
	}
}
