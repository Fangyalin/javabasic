package homework08;

import java.util.Scanner;

public class Sjlx01 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		double sum = 0.0, avg = 0.0;
		double[] scores = new double[4];
		System.out.println("������4λѧԱ�ĳɼ���");
		for (int i = 0; i < scores.length; i++) {
			System.out.print("�������"+ (i+1)+ "λѧԱ�ĳɼ���");
			scores[i] = input.nextDouble();
			sum += scores[i];
		}
		avg = sum / 4;
		System.out.println("����ѧԱ��ƽ�����ǣ�"+ avg);
	}

}
