package ����;

public class MEAN {
	static double count(int[] i) {
		double mean = 0D;
		for (int count = 0; count < i.length; count++) {
			mean += i[count];
		}
		double som = mean / i.length;
		return som;
		// return mean/i.length;
	}

	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
		int[] i = new int[] { 3, 4, 5, 6, 1 };
		double som = MEAN.count(i);
		System.out.println("���������ƽ��ֵ��"+som);
	}

}
