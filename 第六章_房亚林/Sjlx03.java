package homework_Chapter06;

import java.util.Scanner;

public class Sjlx03 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("MyShopping����ϵͳ> �ͻ���Ϣ����> ��ӿͻ���Ϣ\n\n");
		for(int i = 0; i < 3; i ++){
			System.out.print("�������Ա��(<4λ����>):");
			int custNo = input.nextInt();
			if(custNo > 999 && custNo < 10000){
				System.out.print("�������Ա���գ�");
				String birthday = input.next();
				System.out.print("�������Ա���֣�");
				int points = input.nextInt();
				System.out.println("��¼��Ļ�Ա��Ϣ�ǣ�\n"+ custNo +"\t"+ birthday +"\t"+ points+"\n\n");
			}
			else{
				System.out.println("�������");
			}
		}
		System.out.println("���������");
	}

}
