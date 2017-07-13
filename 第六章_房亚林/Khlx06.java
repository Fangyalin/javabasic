package homework_Chapter06;

public class Khlx06 {

	public static void main(String[] args) {
		int sum = 0, i;
		for(i = 1; i <= 4; i ++){
			switch(i){
				case 1:
					sum = sum + 2;
				case 2:
					sum = sum + 4;
					continue;
				case 3:
					sum = sum + 16;
					break;
			}
		}
		System.out.println(sum);
	}

}
