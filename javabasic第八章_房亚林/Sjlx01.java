package homework08;

import java.util.Scanner;

public class Sjlx01 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		double sum = 0.0, avg = 0.0;
		double[] scores = new double[4];
		System.out.println("请输入4位学员的成绩：");
		for (int i = 0; i < scores.length; i++) {
			System.out.print("请输入第"+ (i+1)+ "位学员的成绩：");
			scores[i] = input.nextDouble();
			sum += scores[i];
		}
		avg = sum / 4;
		System.out.println("参赛学员的平均分是："+ avg);
	}

}
