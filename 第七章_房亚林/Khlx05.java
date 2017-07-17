package homework_Chapter07;

public class Khlx05 {

	public static void main(String[] args) {
		int[] array = new int[]{1, 3, -1, 5, -2};
		int[] newArray = new int[5];
		System.out.println("原数组为：");
		for(int i = 0; i < array.length; i++){
			System.out.print(array[i]+ " ");
		}
		for(int i = 0; i < array.length; i ++){
			if(array[array.length-i-1] > 0){
				newArray[i] = array[array.length-1-i];
			}
			else{
				newArray[i] = 0; 
			}
		}
		System.out.println("\n逆序并处理后的数组为：");
		for(int i = 0; i < newArray.length; i ++){
			System.out.print(newArray[i] + " ");
		}
	}

}
