package ����;

public class SEEK {
	static int findEi(int[] in, int el) {
		for (int count = 0; count < in.length; count++) {
			if (el == in[count]) {
				return count;
			}

		}
		return -1;
		// �������Ҳ�����Ԫ�أ����ײ�����
	}

	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
		int[] seek = new int[] { 2, 4, 8, 10, 10, 14 };
		int i = SEEK.findEi(seek, 10);
		System.out.println("����Ϊ��" + i);

	}

}
