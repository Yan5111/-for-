package ����;//���汣�ӣ�����bug//Orz

public class foma {

	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
		int[] gs = new int[] { 11, 22, 33, 22, 55 };
		String sr = "[";
		// ����Sring���ͱ���srΪ"["
		for (int index = 0; index < gs.length; index++) {
			if (index == gs.length - 1) {
				// ���ѭ�������������鳤��-1(���","���Ż�)
				sr = sr + gs[index];
				// ����ӡ","
				continue;
			} else {// }:if
				sr = sr + gs[index] + ",";
				// [11,...���ϼӱ�������
			} // else

		} // for
		sr = sr + "]";

		System.out.println(sr);
		// ���ؽ��

	}

}
