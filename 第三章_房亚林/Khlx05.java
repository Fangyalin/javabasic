package homework7_7;

import java.util.Scanner;

public class Khlx05 {
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		System.out.println("��������ɺɺ�ĳɼ���");
		int score = input.nextInt();
		if(score == 100){
			System.out.println("���׸����򳵣�");
		}
		else if(score>=90){
			System.out.println("ĸ�׸�����һ���ʼǱ����ԣ�");
		}
		else if(score >= 60){
			System.out.println("ĸ�׸�����һ���ֻ���");
		}
		else{
			System.out.println("û������!");
		}
	}
}
