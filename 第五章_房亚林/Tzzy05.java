package homework_Chapter05;

import java.util.Scanner;

public class Tzzy05 {
	public static void main(String[] args){
		/*
		 * 输入一个正整数，将该数的各位左右反转输出，即输入123，输出321。
		 * */
		Scanner input = new Scanner(System.in);
		System.out.println("请输入一个正整数：");
		int x = input.nextInt();
		int s = 0;
		while(x>0){
			s = s*10 + x%10;
			x = x / 10;
		}
		System.out.println(s);
	}
}
