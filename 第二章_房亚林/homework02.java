package homework7_5;

public class homework02 {
	public static void main(String[] args){
		int shirt = 245;
		int shoe = 570;
		int pad = 320;
		int shirtNo = 2;
		int shoeNo = 1;
		int padNo = 1;
		double discount = 0.8;
		double finalpay = (shirt * shirtNo + shoe * shoeNo + pad * padNo) * discount;
		double cost = 1500;
		int dis = 8;
		double fin = cost - finalpay;
		int s = ((int)finalpay / 100) * 3;
		
		System.out.print("**************消费单***************\n\n");
		System.out.print("购买物品\t单价\t个数\t金额\n");
		System.out.print("T恤\t￥"+shirt+"\t"+shirtNo+"\t￥"+shirt*shirtNo+"\n");
		System.out.print("网球鞋\t￥"+shoe+"\t"+shoeNo+"\t￥"+shoe*shoeNo+"\n");
		System.out.print("网球拍\t￥"+pad+"\t"+padNo+"\t￥"+pad*padNo+"\n\n");
		System.out.print("折扣：\t\t"+dis+"折\n");
		System.out.print("消费总金额\t￥"+finalpay+"\n");
		System.out.println("实际交费\t\t￥"+cost);
		System.out.println("找钱\t\t￥"+fin);
		System.out.println("本次购物所获得的积分是："+s);
		
	}
}
