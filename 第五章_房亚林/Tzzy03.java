package homework_Chapter05;

public class Tzzy03 {
	public static void main(String[] args){
		/*
		 * һ��ֽ�ĺ�ȴ�Լ��0.08mm�����۶��ٴ�֮���ܴﵽ���������ĸ߶ȣ�8848.13�ף�?
		 * */
		int i = 0;
		double height = 8848.13 * 1000;
		double ply = 0.08;
		while(ply<=height){
			ply = 2 * ply;
			i ++;
		}
		System.out.println(i);
	}
}
