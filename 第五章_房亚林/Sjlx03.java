package homework_Chapter05;

import java.util.Scanner;

public class Sjlx03 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("请选择购买商品编号");
		System.out.println("1.T 恤\t2.网球鞋\t3.网球拍");
		System.out.println("****************************\n\n");
		String answer = "y";
		double price = 0.0, sum = 0.0;
		double total = 0;
		String name = "";
		while("y".equals(answer)){
			System.out.println("请输入商品编号：");
			int number = input.nextInt();
			System.out.println("请输入购买数量：");
			int number2 = input.nextInt();
			switch(number){
				case 1:
					price = 245.0;
					sum = price * number2;
					name = "T 恤";
					System.out.println(name+"￥"+price+"\t数量"+number2+"\t合计￥"+sum);
					break;
				case 2:
					price = 570.0;
					sum = price * number2;
					name = "网球鞋";
					System.out.println(name+"￥"+price+"\t数量"+number2+"\t合计￥"+sum);
					break;
				case 3:
					price = 320.0;
					sum = price * number2;
					name = "网球拍";
					System.out.println(name+"￥"+price+"\t数量"+number2+"\t合计￥"+sum);
					break;
			}
			total += sum;
			System.out.println("是否继续（y/n）：");
			answer = input.next();
		}
		double discount = 0.8;
		double payment = 0.0;
		System.out.println("折扣："+ discount);
		System.out.println("应付金额"+total * discount);
		System.out.print("实付金额：");
		payment = input.nextDouble();
		System.out.println("找钱："+(payment-total*discount));
	}
}
