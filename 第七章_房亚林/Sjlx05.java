package homework_Chapter07;

import java.util.Scanner;

public class Sjlx05 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int[] money = new int[4];
		System.out.println("������4�ҵ�ļ۸�");
		for(int i = 0; i < money.length; i ++){
			System.out.print("��" + (i+1) +"�ҵ�ļ۸�");
			money[i] = input.nextInt();
		}
		int num = money[0];
		for(int j = 0; j < money.length; j++){
			if(num > money[j]){
				num = money[j];
			}
		}
		System.out.println("��ͼ��ǣ�" + num);
	}

}
