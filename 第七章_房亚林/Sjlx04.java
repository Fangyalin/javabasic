package homework_Chapter07;

import java.util.Scanner;

public class Sjlx04 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		char[] letter = new char[9];
		letter[0] = 'a';
		letter[1] = 'b';
		letter[2] = 'c';
		letter[3] = 'e';
		letter[4] = 'f';
		letter[5] = 'p';
		letter[6] = 'u';
		letter[7] = 'z';
		
		System.out.print("ԭ�ַ����У�");
		for(int i = 0; i < (letter.length-1); i ++){
			System.out.print(letter[i] + " ");
		}
		int index = letter.length;
		System.out.print("��������ַ��ǣ�");
		char let = input.next().charAt(0);
		for(int j = 0; j < letter.length; j++){
			if(let < letter[j]){
				index = j;
				break;
			}
		}
		for(int k = letter.length-1; k > index; k --){
			letter[k] = letter[k-1];
		}
		System.out.println("������ַ��±�Ϊ��"+ index);
		letter[index] = (char)let;
		System.out.print("�������ַ������ǣ�");
		for(int l = 0; l < letter.length; l ++){
			System.out.print(letter[l] + " ");
		}
	}

}
