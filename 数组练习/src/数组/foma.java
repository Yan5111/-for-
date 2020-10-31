package 数组;//佛祖保佑，永无bug//Orz

public class foma {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		int[] gs = new int[] { 11, 22, 33, 22, 55 };
		String sr = "[";
		// 定义Sring类型变量sr为"["
		for (int index = 0; index < gs.length; index++) {
			if (index == gs.length - 1) {
				// 如果循环变量等于数组长度-1(针对","的优化)
				sr = sr + gs[index];
				// 不打印","
				continue;
			} else {// }:if
				sr = sr + gs[index] + ",";
				// [11,...不断加遍历数组
			} // else

		} // for
		sr = sr + "]";

		System.out.println(sr);
		// 返回结果

	}

}
