package homework_Chapter06;

public class Kzzy01 {

	public static void main(String[] args) {
		int a = 0, b = 0, c = 0;
		for(int i = 101; i > 100 && i<999; i ++){
			a = i % 10;
			b = i / 10 % 10;
			c = i / 100;
			if(i == a*a*a + b*b*b + c*c*c){
				System.out.println(i);
			}
		}
	}

}
