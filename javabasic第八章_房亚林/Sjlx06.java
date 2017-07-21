package homework08;

import java.util.Scanner;

public class Sjlx06 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		double[] num = new double[3];
		for (int i = 0; i < 3; i++) {
			int num2 = 0;
			System.out.println("请请输入第"+ (i+1) + "个人所购的三件商品的价格：");
			for (int j = 0; j < 3; j++) {
				num[j] = input.nextDouble();
				if(num[j] > 300){
					num2 ++;
				}
				else{
					continue;
				}
			}
			System.out.println("第"+ (i+1)+ "个人共有"+ num2+ "件商品享受8折优惠！");
		}
	}

}
