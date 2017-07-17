package homework_Chapter07;

import java.util.Arrays;

public class Sjlx03 {

	public static void main(String[] args) {
		char[] letter = new char[]{'a','c','u','b','e','p','f','z'};
		System.out.print("Ô­×Ö·ûÐòÁÐ£º");
		for(int i = 0; i < letter.length; i ++){
			System.out.print(letter[i] + " ");
		}
		System.out.print("\n");
		Arrays.sort(letter);
		System.out.print("ÉýÐòÅÅÁÐºó£º");
		for(int j = 0; j < letter.length; j ++){
			System.out.print(letter[j] + " ");
		}
		System.out.print("\n");
		System.out.print("ÄæÐòÅÅÐòºó£º");
		for(int a = 0; a < letter.length; a ++){
			System.out.print(letter[letter.length - 1 - a] + " z");
		}
	}

}
