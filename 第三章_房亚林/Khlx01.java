package homework7_7;

import java.util.Scanner;

public class Khlx01 {
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		System.out.println("请输入用户名：");
		String name = input.next();
		if(name.contentEquals("青")){
			System.out.println("请输入密码：");
			int num = input.nextInt();
			if(num == 123){
				System.out.println("欢迎你，青");
			}
			else{
				System.out.println("对不起，你不是青");
			}
		}
		else{
			System.out.println("对不起，你不是青");
		}
	}
}
