package homework7_7;

import java.util.Scanner;

public class Khlx02 {
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		System.out.println("请输入你的年龄：");
		int year = input.nextInt();
		if(year>=5||year>=7){
			System.out.println("请输入你的性别：");
			String gender = input.next();
			if(gender.contentEquals("男")){
				System.out.println("可以搬动桌子！");
			}
			else{
				System.out.println("搬不动桌子！");
			}
		}
		else{
			System.out.println("搬不动桌子！");
		}
	}
}
