package homework7_5;

import java.util.Scanner;
public class homework03 {
	public static void main(String[] args){
		int custNo;
		
		System.out.println("��������λ��Ա���ţ�");
		Scanner input = new Scanner(System.in);
		custNo = input.nextInt();
		
		int gewei = custNo % 10;
		int shiwei = custNo / 10 % 10;
		int baiwei = custNo / 100 % 10;
		int qianwei = custNo / 1000;
		
		int sum = gewei + shiwei + baiwei + qianwei;
		System.out.println("��Ա����:"+custNo+"��λ֮�ͣ�"+sum);
		boolean isLuck = sum>20;
		System.out.println("�����˿ͻ���"+isLuck);
		
	}
}
