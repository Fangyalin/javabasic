package homework_Chapter07;

import java.util.Scanner;

public class Khlx02 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String[] talk = new String[5];
		System.out.println("��������仰��");
		for(int i = 0; i < talk.length; i ++){
			System.out.print("��"+ (i+1) +"�仰��");
			talk[i] = input.next();
		}
		System.out.println("\n���������5��仰Ϊ��");
		for(int j = 0; j < talk.length; j ++){
			System.out.println(talk[talk.length-1-j] + " ");
		}
	}

}
