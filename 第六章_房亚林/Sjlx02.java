package homework_Chapter06;

import java.util.Scanner;

public class Sjlx02 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int age = 0,num = 0;
		double num1 = 0, num2 = 0;
		for(num = 0;num <10;num ++){
			System.out.print("�������"+ (num+1)+ "λ�˿͵����䣺");
			age = input.nextInt();
			if(age >= 30){
				num1 += 1;
			}
			else if(age < 30){
				num2 += 1;
			}
			else{
				System.out.print("����������������룡");
			}
		}
		System.out.println("30�����µı���Ϊ��"+ (num2*10) + "%");
		System.out.println("30�����ϵı���Ϊ��"+ (num1*10) + "%");
	}

}
