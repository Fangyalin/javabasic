package homework7_8;

import java.util.Scanner;

public class Khlx03 {
	public static void main(String[] args){
		System.out.println("请输入成绩：");
		Scanner input = new Scanner(System.in);
		int score = input.nextInt();
		switch(score/10){
			case 10:
				System.out.println("父亲给他买一辆车！");
				break;
			case 9:
				System.out.println("母亲给他买一部笔记本电脑");
				break;
			case 8:
			case 7:
			case 6:
				System.out.println("母亲给他买一部手机");
				break;
			case 5:
			case 4:
			case 3:
			case 2:
			case 1:
			case 0:
				System.out.println("没有礼物");
				break;
			default:
				System.out.println("请输入正确成绩！");
				break;
		}
	}
}
