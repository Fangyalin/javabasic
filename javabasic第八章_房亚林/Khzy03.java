package homework08;

public class Khzy03 {

	public static void main(String[] args) {
		int k =0;
		for (int i = 1; i <= 20; i++) {
			for (int j = 1; j <= 33; j++) {
				k = 100 - i - j;
				if(5 * i + j * 3 + k/3 == 100){
					System.out.println("¹«¼¦" + i);
					System.out.println("Ä¸¼¦" + j);
					System.out.println("³û¼¦" + k + "\n");
				}
			}
		}
	}

}
