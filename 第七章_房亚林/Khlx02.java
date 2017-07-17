package homework_Chapter07;

import java.util.Scanner;

public class Khlx02 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String[] talk = new String[5];
		System.out.println("请输入五句话：");
		for(int i = 0; i < talk.length; i ++){
			System.out.print("第"+ (i+1) +"句话：");
			talk[i] = input.next();
		}
		System.out.println("\n逆序输出这5五句话为：");
		for(int j = 0; j < talk.length; j ++){
			System.out.println(talk[talk.length-1-j] + " ");
		}
	}

}
