package homework_Chapter06;

public class Sjlx01 {

	public static void main(String[] args) {
		int num = 0, sum = 0;
		for(num = 0;num <= 100;num ++){
			if(num % 2 != 0){
				sum += num;
			}
		}
		System.out.println("100以内奇数之和为："+ sum);
	}

}
