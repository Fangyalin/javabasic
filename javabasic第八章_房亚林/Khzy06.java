package homework08;

import java.util.Scanner;

public class Khzy06 {

	public static void main(String[] args) {
		int rows = 0;
		Scanner input = new Scanner(System.in);
		System.out.print("请输入菱形行数：");
		rows = input.nextInt();
		while(rows % 2 == 0){
			System.out.print("请输入奇数：");
			rows = input.nextInt();
		}
		for (int i = 0; i < rows; i++) {
			if(i <= (rows-1)/2){
				for(int j = i; j < (rows-1)/2; j++) {
					System.out.print(" ");
				}
				for(int k = 0; k < 2 * i + 1; k++){
					System.out.print("*");
				}
			}
			else{
				for(int j = 0; j < i - (rows - 1) / 2; j++) {
					System.out.print(" ");
				}
				for(int k = 0; k < 2 * (rows - i) - 1; k++){
					System.out.print("*");
				}
			}
			System.out.println();
		}
	}

}
