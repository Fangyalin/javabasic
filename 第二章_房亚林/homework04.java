package homework7_5;

import java.util.Scanner;
public class homework04 {
	public static void main(String[] args){
		int shirt = 245;
		int shoe = 570;
		int pad = 320;
		Scanner input = new Scanner(System.in);
		System.out.println("�������ۿۣ�");
		double discount = input.nextDouble();
		double shirtDis = shirt * discount;
		double shoeDis = shoe * discount;
		double padDis = pad * discount;
		boolean shirtbool = shirtDis < 100;
		boolean shoebool = shoeDis < 100;
		boolean padbool = padDis < 100;
		System.out.println("T���ۿۼ۵���100��"+ shirtbool);
		System.out.println("����Ь�ۿۼ۵���100��"+ shoebool);
		System.out.println("�������ۿۼ۵���100��"+ padbool);
	}
}
