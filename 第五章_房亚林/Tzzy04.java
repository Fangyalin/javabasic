package homework_Chapter05;

import java.util.Scanner;

public class Tzzy04 {
	public static void main(String[]args){
		/*
		 * 计算用户输入的日期离1900年1月1日相距多少天。（注意闰年）
		 * */
		Scanner input = new Scanner(System.in);
		System.out.println("请输入年份：");
		int year = input.nextInt();
		System.out.println("请输入月份");
		int month = input.nextInt();
		System.out.println("请输入日");
		int day = input.nextInt();
		int i = 1900,sum = 0;
		while(year>i){
			if(year%4==0&&year%100!=0||year%400==0){
				sum += 366;
			}
			else{
				sum += 365;
			}
			i ++;
		}
		int a = 1;
		while(a<month){
			if(a==1||a==3||a==5||a==7||a==8||a==10||a==12){
				sum += 31;
			}
			else if(a == 2){
				if(year%4==0&&year%100!=0||year%400==0){
					sum += 29;
				}
				else{
					sum += 28;
				}
			}
			else{
				sum += 30;
			}
	}
		sum = sum + day;
		System.out.println(year+"年"+month+"月"+day+"日"+"距1900年一月一日"+sum+"天");
	}
}
