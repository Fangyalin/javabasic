package homework08;

import java.util.Scanner;

public class Khzy04 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		double avg = 0.0;
		int num = 0, num1 = 0;
		for (int i = 0; i < 3; i++) {
			int[] scores = new int[4];
			System.out.println("�������" + (i+1) + "���༶��ѧԱ�ɼ���");
			for (int j = 0; j < 4; j++) {
				System.out.print("�������" + (j+1) + "λѧԱ�ĳɼ���");
				scores[j] = input.nextInt();
				if(scores[j] > 85){
					num += scores[j];
					num1 ++;
				}
			}
		}
		avg = num / num1;
		System.out.println("����85�����ϵ�ѧ����ƽ����Ϊ��" + avg);
	}

}
