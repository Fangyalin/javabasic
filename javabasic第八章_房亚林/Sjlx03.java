package homework08;

import java.util.Scanner;

public class Sjlx03 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("请输入直角三角形的高度：");
		int high = input.nextInt();
		for (int i = 0; i < high; i++) {
			for (int j = 0; j < high-i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
