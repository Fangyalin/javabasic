package homework7_7;

import java.util.Scanner;

public class Sjlx02 {
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		System.out.println("�������Ա�ţ�");
		int id = input.nextInt();
		if(id>999&&id<10000){
			System.out.println("�������Ա���գ���/��<����λ����ʾ>����");
			String day = input.next();
			System.out.println("���������:");
			int num = input.nextInt();
			System.out.println("\n\n��¼��Ļ�Ա��Ϣ�ǣ�");
			System.out.println(id+"\t"+day+"\t"+num+"\n");
		}
		else{
			System.out.println("��Ϣ¼��ʧ��");
		}
	}
}
