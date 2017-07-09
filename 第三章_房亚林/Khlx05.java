package homework7_7;

import java.util.Scanner;

public class Khlx05 {
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		System.out.println("请输入刘珊珊的成绩：");
		int score = input.nextInt();
		if(score == 100){
			System.out.println("父亲给他买车！");
		}
		else if(score>=90){
			System.out.println("母亲给他买一部笔记本电脑！");
		}
		else if(score >= 60){
			System.out.println("母亲给他买一部手机！");
		}
		else{
			System.out.println("没有礼物!");
		}
	}
}
