package homework_Chapter07;

import java.util.Scanner;

public class Khlx04 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int num1 = 0, num2 = 0, num3 = 0, num4 = 0;
		int[] nums = new int[10];
		System.out.println("������ʮ������");
		for(int i = 0; i < nums.length; i++){
			nums[i] = input.nextInt();
			if(nums[i] == 1){
				num1 ++;
			}
			else if(nums[i] == 2){
				num2 ++;
			}
			else if(nums[i] == 3){
				num3 ++;
			}
			else{
				num4 ++;
			}
				
		}
		System.out.println("����1�ĸ�����"+ num1);
		System.out.println("����2�ĸ�����"+ num2);
		System.out.println("����3�ĸ�����"+ num3);
		System.out.println("�Ƿ����ֵĸ�����"+ num4);
	}

}
