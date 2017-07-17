package homework_Chapter07;

public class Kzzy01 {

	public static void main(String[] args) {
		 int[] oldArr = new int[]{1, 3, 4, 5, 0, 0, 6, 6, 0, 5, 4, 7, 6, 7, 0, 5};
		 int index = 0;
		 System.out.println("原数组为：");
		 for(int i = 0; i < oldArr.length; i ++){
			 System.out.print(oldArr[i] + " ");
		 }
		 for(int i = 0; i < oldArr.length; i++){
			 if(oldArr[i] != 0){
				 index ++;
			 }
		 }
		 int[] newArr = new int[index];
		 int size = 0;
		 for(int j = 0; j < oldArr.length; j ++){
			 if(oldArr[j] != 0){
				 newArr[size] = oldArr[j];
				 size ++;
			 }
		 }
		 System.out.println("\n新的数组为：");
		 for(int i = 0; i < newArr.length; i ++){
			 System.out.print(newArr[i] + " ");
		 }
	}

}
