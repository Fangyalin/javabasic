package homework08;

public class Kzzy02 {

	public static void main(String[] args) {
		for (int i = 1; i < 10; i++) {
			for (int j = 1; j <= 2 * i - 2; j++) {
				System.out.print ("\t");
				}
			for (int j = i; j < 10; j++) {
				System.out.print (i + " * " + j + " = " + (i * j) + "\t");
				}
			System.out.println ();
			}
	}
}
