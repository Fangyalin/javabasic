package homework_Chapter06;

import java.util.Scanner;

public class Sjlx04 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		for(int i = 1;i <= 3;i ++){
			System.out.print("�������û�����");
			String name = input.next();
			System.out.print("���������룺");
			int password = input.nextInt();
			if(name.contentEquals("jim")&&password==123456){
				System.out.println("��ӭ��½MyShoppingϵͳ��");
				break;
			}
			else if(i!=3){
				System.out.println("�������������"+ (3-i) +"�λ���");
				continue;
			}
			else{
				System.out.println("\n�Բ�����3�ξ��������");
				break;
			}
		}
	}

}
