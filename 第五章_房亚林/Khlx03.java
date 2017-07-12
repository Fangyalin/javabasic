package homework_Chapter05;

public class Khlx03 {

	public static void main(String[] args) {
		int num = 7, sum = 0;
		do{
			if(num % 7 == 0){
				System.out.println(num);
				sum = sum + num;
			}
			num ++;
		}while(num<=50);
		System.out.println("各数之和为:"+sum);
	}

}
