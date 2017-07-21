package homework08;

public class Sjlx05 {

	public static void main(String[] args) {
		for (int i = 1; i <= 9; i++) {
			for (int j = 1; j < i+1; j++) {
				System.out.print(j + "*" + i + "=" + (j*i) + "\t");
			}
			System.out.println();
		}
	}

}
