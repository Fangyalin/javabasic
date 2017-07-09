package homework7_7;

import java.util.Scanner;

public class Khlx04 {
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		System.out.println("请输入一个整数：");
		int num = input.nextInt();
		if(num%3==0||num%5==0){
			System.out.println("该整数是3或5的倍数！");
		}
		else{
			System.out.println("该数不能被3或5中的任何一个数整除！");
		}
	}
}
