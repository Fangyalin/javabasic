package homework_Chapter07;

import java.util.Scanner;

public class Sjlx02 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int a = 0;
		double sum = 0.0;
		double[] figure = new double[5];
		for(int i = 0; i < figure.length; i++){
			System.out.print("�������" + (i+1) + "�����ѽ�");
			figure[i] = input.nextDouble();
		}
		System.out.println("\n���\t\t��Ԫ��");
		for(int j = 0; j < figure.length; j++){
			a = j + 1;
			System.out.println(a + "\t\t" + figure[j]);
			sum += figure[j];
		}
		System.out.println("�ܽ��\t\t" + sum);
	}

}
