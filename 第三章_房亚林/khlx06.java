package homework7_7;

import java.util.Scanner;

public class khlx06 {
	public static void main(String[] args){
		double price;
		Scanner input = new Scanner(System.in);
		System.out.println("�����������е��·ݣ�");
		int mon = input.nextInt();
		if(mon>=4&&mon<=10){
			System.out.println("��������Ҫ���Ĳ�λ��");
			String fs = input.next();
			if(fs.contentEquals("ͷ�Ȳ�")){
				price = 5000 * 0.9;
			}
			else{
				price = 5000 * 0.8;
			}
		}
		else{
			System.out.println("��������Ҫ���Ĳ�λ��");
			String fs = input.next();
			if(fs.contentEquals("ͷ�Ȳ�")){
				price = 5000 * 0.5;
			}
			else{
				price = 5000 * 0.4;
			}
		}
		System.out.println("����Ʊ��Ϊ��"+price);
	}
}
