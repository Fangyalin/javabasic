package homework_Chapter07;

public class Khlx03 {

	public static void main(String[] args) {
		int[] points = new int[]{18,25,7,36,13,2,89,63};
		int min = points[0], index = 0;
		for(int i = 1; i < points.length; i++){
			if(min > points[i]){
				min = points[i];
			}
		}
		for(int i = 0; i < points.length; i++){
			if(min == points[i]){
				index = i;
			}
		}
		System.out.println("最小值是：" + min + "下标为：" + index);
	}

}
