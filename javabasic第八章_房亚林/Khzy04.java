package homework08;

import java.util.Scanner;

public class Khzy04 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		double avg = 0.0;
		int num = 0, num1 = 0;
		for (int i = 0; i < 3; i++) {
			int[] scores = new int[4];
			System.out.println("请输入第" + (i+1) + "个班级的学员成绩：");
			for (int j = 0; j < 4; j++) {
				System.out.print("请输入第" + (j+1) + "位学员的成绩：");
				scores[j] = input.nextInt();
				if(scores[j] > 85){
					num += scores[j];
					num1 ++;
				}
			}
		}
		avg = num / num1;
		System.out.println("所有85分以上的学生的平均分为：" + avg);
	}

}
