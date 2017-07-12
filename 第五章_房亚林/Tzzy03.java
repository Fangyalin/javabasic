package homework_Chapter05;

public class Tzzy03 {
	public static void main(String[] args){
		/*
		 * 一张纸的厚度大约是0.08mm，对折多少次之后能达到珠穆朗玛峰的高度（8848.13米）?
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
