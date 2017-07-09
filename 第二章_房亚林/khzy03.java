package homework7_5;

public class khzy03 {
	public static void main(String[] args){
		int a = 10;
		int b = 8;
		int c = 0;
		System.out.println("输出互换前手中的纸牌：");
		System.out.println("左手中的纸牌："+ a);
		System.out.println("右手中的纸牌："+ b+"\n");
		System.out.println("输出互换后手中的纸牌：");
		c = a;
		a = b;
		b = c;
		System.out.println("左手中的纸牌："+ a);
		System.out.println("右手中的纸牌："+ b);
	}
}
