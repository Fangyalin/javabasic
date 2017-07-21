package homework08;

import java.util.Scanner;

public class Sjlx04 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("请输入等腰三角形的行数：");
		int num = input.nextInt();
		for (int i = 0; i < num; i++) {
			for (int j = 0; j < num-i; j++) {
				System.out.print(" ");
			}
			for (int j = 0; j < 2*i+1; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
