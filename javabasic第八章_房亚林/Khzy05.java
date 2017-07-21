package homework08;

import java.util.Scanner;

public class Khzy05 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		for (int i = 0; i < 3; i++) {
			System.out.print("请输入密码：");
			int num = input.nextInt();
			if(num == 111111){
				for (int j = 0; j < num; j++) {
					System.out.print("请输入金额：");
					int money = input.nextInt();
					if(money%100 == 0){
						if(money > 0 && money < 1000){
							System.out.println("您取了" + money + "元！");
							System.out.println("交易完成，请取卡！");
							return;
						}
						else{
							System.out.println("您输入的金额不合法，请重新输入：");
							continue;
						}
					}
					else{
						System.out.println("您输入的金额不合法，请重新输入：");
						continue;
					}
				}
			}
			else if(i<2){
				System.out.println("输入错误，请重新输入！");
				continue;
			}
			else{
				break;
			}
		}
		System.out.println("密码错误，请取卡！");
	}

}
