package homework_Chapter07;

import java.util.Scanner;

public class Sjlx05 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int[] money = new int[4];
		System.out.println("请输入4家店的价格：");
		for(int i = 0; i < money.length; i ++){
			System.out.print("第" + (i+1) +"家店的价格：");
			money[i] = input.nextInt();
		}
		int num = money[0];
		for(int j = 0; j < money.length; j++){
			if(num > money[j]){
				num = money[j];
			}
		}
		System.out.println("最低价是：" + num);
	}

}
