package homework08;

import java.util.Scanner;

public class Sjlx06 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		double[] num = new double[3];
		for (int i = 0; i < 3; i++) {
			int num2 = 0;
			System.out.println("���������"+ (i+1) + "����������������Ʒ�ļ۸�");
			for (int j = 0; j < 3; j++) {
				num[j] = input.nextDouble();
				if(num[j] > 300){
					num2 ++;
				}
				else{
					continue;
				}
			}
			System.out.println("��"+ (i+1)+ "���˹���"+ num2+ "����Ʒ����8���Żݣ�");
		}
	}

}
