package ����;

public class Indax {

	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
		int d = 22;
		int[] i = new int[] { 11, 22, 33, 44, 22,55 };
		// ��̬����     ������    0   1   2   3   4
		for (int s = 0; s < i.length; s++) {
			// ���������ڳ���4
			if (d == i[s]) {
				// �������i�������Ͳ�ִ��
				System.out.println("����i��Ԫ��:"+d+"-������"+s);
				// ��ӡs
			} else {
				continue;
				// �˳�ѭ��
			} // if
		} // forѭ��

	}// main����

}// class��
