package homework7_7;

import java.util.Scanner;

public class Khlx02 {
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		System.out.println("������������䣺");
		int year = input.nextInt();
		if(year>=5||year>=7){
			System.out.println("����������Ա�");
			String gender = input.next();
			if(gender.contentEquals("��")){
				System.out.println("���԰ᶯ���ӣ�");
			}
			else{
				System.out.println("�᲻�����ӣ�");
			}
		}
		else{
			System.out.println("�᲻�����ӣ�");
		}
	}
}
