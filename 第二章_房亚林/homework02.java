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
		
		System.out.print("**************���ѵ�***************\n\n");
		System.out.print("������Ʒ\t����\t����\t���\n");
		System.out.print("T��\t��"+shirt+"\t"+shirtNo+"\t��"+shirt*shirtNo+"\n");
		System.out.print("����Ь\t��"+shoe+"\t"+shoeNo+"\t��"+shoe*shoeNo+"\n");
		System.out.print("������\t��"+pad+"\t"+padNo+"\t��"+pad*padNo+"\n\n");
		System.out.print("�ۿۣ�\t\t"+dis+"��\n");
		System.out.print("�����ܽ��\t��"+finalpay+"\n");
		System.out.println("ʵ�ʽ���\t\t��"+cost);
		System.out.println("��Ǯ\t\t��"+fin);
		System.out.println("���ι�������õĻ����ǣ�"+s);
		
	}
}
