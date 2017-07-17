package homework_Chapter07;

public class Kzzy03 {

	public static void main(String[] args) {
		int[] nums = new int[]{22, 11, 33, 15, 23, 12, 14, 55};
		int sum = 0, min = nums[0], max = 0;
		System.out.print("原数组为：");
		for(int i = 0; i < nums.length; i ++){
			System.out.print(nums[i] + " ");
		}
		for(int i = 0; i < nums.length; i ++){
			if(min > nums[i]){
				min = nums[i];
			}
			if(max < nums[i]){
				max = nums[i];
			}
			sum += nums[i];
		}
		System.out.println("\n各元素的和为：" + sum);
		System.out.println("最大值为：" + max);
		System.out.println("最小值为：" + min);
	}

}
