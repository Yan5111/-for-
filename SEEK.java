package 方法;

public class SEEK {
	static int findEi(int[] in, int el) {
		for (int count = 0; count < in.length; count++) {
			if (el == in[count]) {
				return count;
			}

		}
		return -1;
		// 数组中找不到该元素（兜底操作）
	}

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		int[] seek = new int[] { 2, 4, 8, 10, 10, 14 };
		int i = SEEK.findEi(seek, 10);
		System.out.println("索引为：" + i);

	}

}
