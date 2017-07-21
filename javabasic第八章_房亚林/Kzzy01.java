package homework08;


public class Kzzy01 {

	public static void main(String[] args) {
		int x, y;
		for (y = 0; y <= 5; y++){
			for (x = 0; x <= 5; x++) {
				if (x == 5)
					System.out.print("*\n");
				else if (x == 0 || y == 0 || y == 5)
					System.out.print("*");
				else
					System.out.print(" ");
			}
		}
	}
}
