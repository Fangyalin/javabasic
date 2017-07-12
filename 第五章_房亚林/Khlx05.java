package homework_Chapter05;

import java.util.Scanner;

public class Khlx05 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int i = 0;
		do{
			System.out.println("请输入一个数字1~7（输入0结束）：");
			i = input.nextInt();
			if(i!=0){
				if(i<=7&&i>0)
				switch(i){
					case 1:
						System.out.println("今天是MON");
						break;
					case 2:
						System.out.println("今天是TUE");
						break;
					case 3:
						System.out.println("今天是WED");
						break;
					case 4:
						System.out.println("今天是THU");
						break;
					case 5:
						System.out.println("今天是FRI");
						break;
					case 6:
						System.out.println("今天是SAT");
						break;
					case 7:
						System.out.println("今天是SUM");
						break;
				}
				else{
					System.out.println("输入错误，请重新输入：");
					break;
				}
			}
		}while(i!=0);
		System.out.println("程序结束！");
	}

}
