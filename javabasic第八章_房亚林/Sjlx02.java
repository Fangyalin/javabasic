package homework08;

import java.util.Scanner;

public class Sjlx02 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("�����������εĸ߶ȣ�");
		int high = input.nextInt();
		for (int i = 0; i < high; i++) {
			for (int j = 0; j < 2*i+1; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
