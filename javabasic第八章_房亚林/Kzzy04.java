package homework08;

public class Kzzy04 {

	public static void main(String[] args) {
		int[] arr = new int[]{78, 9, 34, 84, 100}; 
		for(int i=0; i<5; i++){//表示n次排序过程。
			for(int j=1; j<5-i; j++){
				if(arr[j-1] > arr[j]){//前面的数字大于后面的数字就交换
					//交换a[j-1]和a[j]
					int temp;
					temp = arr[j-1];
					arr[j-1] = arr[j];
					arr[j]=temp;
					}
				}
			}
		for (int i = 0; i < 5; i++) {
			System.out.print(arr[i] + " ");
		}
	}

}
