package homework08;

import java.util.Scanner;

public class Khzy05 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		for (int i = 0; i < 3; i++) {
			System.out.print("���������룺");
			int num = input.nextInt();
			if(num == 111111){
				for (int j = 0; j < num; j++) {
					System.out.print("�������");
					int money = input.nextInt();
					if(money%100 == 0){
						if(money > 0 && money < 1000){
							System.out.println("��ȡ��" + money + "Ԫ��");
							System.out.println("������ɣ���ȡ����");
							return;
						}
						else{
							System.out.println("������Ľ��Ϸ������������룺");
							continue;
						}
					}
					else{
						System.out.println("������Ľ��Ϸ������������룺");
						continue;
					}
				}
			}
			else if(i<2){
				System.out.println("����������������룡");
				continue;
			}
			else{
				break;
			}
		}
		System.out.println("���������ȡ����");
	}

}
