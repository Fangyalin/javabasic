package homework_Chapter06;

public class Khlx05 {

	public static void main(String[] args) {
		int men = 1, women = 1, kids = 1;
		for(men = 1; men <= 30; men ++){
			for(women = 1; women <= 30; women ++){
				kids = 30 - men - women;
				if(3*men + 2*women + kids == 50){
					System.out.println("男人"+ men +"女人"+ women +"小孩"+ kids);
					continue;
				}
			}
		}
	}
}
