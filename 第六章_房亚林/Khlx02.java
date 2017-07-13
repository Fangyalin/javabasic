package homework_Chapter06;

import java.util.Scanner;

public class Khlx02 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		double time = 0.0,sum = 0.0;
		for(int i = 0;i < 5;i ++){
			System.out.print("请输入周"+(i+1)+"的学习时间：");
			time = input.nextDouble();
			sum = sum + time;
		}
		double avg = sum / 5;
		System.out.println("周一至周五每日平均学习时间是："+ avg +"小时");
	}

}
