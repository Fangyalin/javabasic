package homework_Chapter06;

public class Khlx04 {

	public static void main(String[] args) {
		 for(int i = 1; i <= 100; i ++){
			 if(i % 3 == 0 && i % 5 == 0){
				 System.out.println("FlipFlop");
			 }
			 else if(i % 3 == 0){
				 System.out.println("Flip");
			 }
			 else if(i % 5 == 0){
				 System.out.println("Flop");
			 }
			 else{
				 System.out.println(i);
			 }
		 }
	}

}
