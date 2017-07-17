package homework_Chapter07;

import java.util.Arrays;

public class Kzzy02 {

	public static void main(String[] args) {
		int[] arr1 = new int[]{1, 7, 9, 11, 13, 15, 17, 19};
		int[] arr2 = new int[]{2, 4, 6, 8, 10};
		int[] arr3 = new int[13];
		System.arraycopy(arr1, 0, arr3, 0, 8);
		System.arraycopy(arr2, 0, arr3, 8, 5);
		Arrays.sort(arr3);
		System.out.println("新数组为：");
		for(int i = 0; i < arr3.length; i ++){
			System.out.print(arr3[i] + " ");
		}
	}

}
