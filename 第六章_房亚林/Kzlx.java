package homework_Chapter06;

public class Kzlx {

	public static void main(String[] args) {
		int i = 0;
		for(i = 0; i <= 7;){
			i += 3;
			if(i == 7){
				i -= 2;
				break;
			}
			else{
				i -= 2;
			}
		}
		System.out.println("ÐèÒª"+ i + "Ìì");
	}

}
