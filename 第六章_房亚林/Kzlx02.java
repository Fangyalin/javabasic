package homework_Chapter06;

import java.util.Scanner;

public class Kzlx02 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("请输入一个正整数：");
		int number = input.nextInt();
		int a = 0;
		for(int i = 2; i < number; i ++){
			if(number % i == 0){
				a++;
			}
		}
		if(a == 0){
			System.out.println(number + "是质数");
		}
		else{
			System.out.println(number + "不是质数");
		}
	}

}
