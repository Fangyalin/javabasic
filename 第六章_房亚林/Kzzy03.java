package homework_Chapter06;

public class Kzzy03 {

	public static void main(String[] args) {
		int number = 0, sum = 0;
		for(int i = 0 ; i < 8; i ++){
			number = number*10 + 2;
			sum += number;
		}
		System.out.println(sum);
	}

}
