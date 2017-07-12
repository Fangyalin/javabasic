package homework_Chapter05;

import java.util.Scanner;

public class Khlx04 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int i = 0, num = 0,num1 = 0, num2 = 0;
		do{
			System.out.println("请输入一个整数（输入0结束）：");
			i = input.nextInt();
			if(i!=0){
				num1 = i;
				num2 = i;
				if(num1>num){
					num = num1;
				}
				if(num1<num2){
					num2 = num1;
				}
			}
		}while(i!=0);
		System.out.println("最大值："+num+"最小值"+num2);
	}

}
