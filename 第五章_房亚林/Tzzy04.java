package homework_Chapter05;

import java.util.Scanner;

public class Tzzy04 {
	public static void main(String[]args){
		/*
		 * �����û������������1900��1��1���������졣��ע�����꣩
		 * */
		Scanner input = new Scanner(System.in);
		System.out.println("��������ݣ�");
		int year = input.nextInt();
		System.out.println("�������·�");
		int month = input.nextInt();
		System.out.println("��������");
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
		System.out.println(year+"��"+month+"��"+day+"��"+"��1900��һ��һ��"+sum+"��");
	}
}
