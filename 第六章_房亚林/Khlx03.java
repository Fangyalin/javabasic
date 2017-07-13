package homework_Chapter06;

public class Khlx03 {

	public static void main(String[] args) {
		int chookNum = 0, rabbitNum = 0;
		for(chookNum = 0;chookNum <=35;chookNum ++){
			rabbitNum = 35 - chookNum;
			if(2 * chookNum + 4 * rabbitNum == 94){
				System.out.println("鸡有"+ chookNum + "只\n"+"兔子有"+rabbitNum+"只");
			}
		}
	}

}
