package homework_Chapter05;

public class Tzzy01 {
	public static void main(String[] args){
		/*
		 * 计算一到一百的和
		 * */
		int num = 0,i = 1;
		while(i <= 100){
			num =num + i;
			i ++;
		}
		System.out.println("一到一百的和为"+num);
	}
}
