package homework_Chapter07;

public class Kzzy04 {

	public static void main(String[] args) {
		int[][] arr = new int[20][5];
		int[] sum = new int[20];
		int[] total = new int[5];
		int i, j, k = 0;
		for (i = 0; i < 20; i++){
			for (j = 0; j < 5; j++){
			    arr[i][j] = (int) (Math.random() * 100);
			}
		}
		System.out.println("\t\t学生成绩");
		System.out.println("core\tC++\tJava\tPython\tC##\tC");
		for (i = 0; i < 20; i++) {
			System.out.print((i+1) + "号\t");
			for (j = 0; j < 5; j++){
				System.out.print(arr[i][j] + "\t");
				}
			System.out.println();
		}
		for (i = 0; i < 20; i++){
			for (j = 0; j < 5; j++) {
				sum[i] += arr[i][j];
			}
			System.out.println((i+1)+ "号学生总分：" + sum[i]);
		}
		System.out.println("\tC++\tJava\tPython\tC##\tC");
		for (i = 0; i < 5; i++) {
			for (j = 0; j < 20; j++) {
				total[i] += arr[i][i];
			}
			System.out.print("\t" + total[i] / 20);
		}	
	}

}
