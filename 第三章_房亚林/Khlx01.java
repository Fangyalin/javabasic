package homework7_7;

import java.util.Scanner;

public class Khlx01 {
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		System.out.println("�������û�����");
		String name = input.next();
		if(name.contentEquals("��")){
			System.out.println("���������룺");
			int num = input.nextInt();
			if(num == 123){
				System.out.println("��ӭ�㣬��");
			}
			else{
				System.out.println("�Բ����㲻����");
			}
		}
		else{
			System.out.println("�Բ����㲻����");
		}
	}
}
