package ����;

public class Big {

	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
		int big=0;
		int[] i= {11,22,33,44,55,66};
		//����
		for(int ce=0;ce<i.length;ce++) {
			if(big<i[ce]) {
				big=i[ce];
				
			}
			
		}
		System.out.println("���"+big);
	}

}
