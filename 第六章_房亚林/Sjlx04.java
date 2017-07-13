package homework_Chapter06;

import java.util.Scanner;

public class Sjlx04 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		for(int i = 1;i <= 3;i ++){
			System.out.print("请输入用户名：");
			String name = input.next();
			System.out.print("请输入密码：");
			int password = input.nextInt();
			if(name.contentEquals("jim")&&password==123456){
				System.out.println("欢迎登陆MyShopping系统！");
				break;
			}
			else if(i!=3){
				System.out.println("输入错误！您还有"+ (3-i) +"次机会");
				continue;
			}
			else{
				System.out.println("\n对不起，您3次均输入错误！");
				break;
			}
		}
	}

}
