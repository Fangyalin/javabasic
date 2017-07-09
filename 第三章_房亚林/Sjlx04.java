package homework7_7;

import java.util.Scanner;

public class Sjlx04 {
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		System.out.println("请输入会员积分：");
		int integral = input.nextInt();
		if(integral<2000){
			System.out.println("该会员享受的折扣是： 9折");
		}
		else if(integral>=2000&&integral<4000){
			System.out.println("该会员享受的折扣是： 8折");
		}
		else if(integral>=4000&&integral<8000){
			System.out.println("该会员享受的折扣是： 7折");
		}
		else{
			System.out.println("该会员享受的折扣是： 6折");
		}
	}
}
