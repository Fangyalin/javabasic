package homework_Chapter06;

import java.util.Scanner;

public class Khlx02 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		double time = 0.0,sum = 0.0;
		for(int i = 0;i < 5;i ++){
			System.out.print("��������"+(i+1)+"��ѧϰʱ�䣺");
			time = input.nextDouble();
			sum = sum + time;
		}
		double avg = sum / 5;
		System.out.println("��һ������ÿ��ƽ��ѧϰʱ���ǣ�"+ avg +"Сʱ");
	}

}
