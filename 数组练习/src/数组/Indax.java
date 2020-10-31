package 数组;

public class Indax {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		int d = 22;
		int[] i = new int[] { 11, 22, 33, 44, 22,55 };
		// 静态数组     索引：    0   1   2   3   4
		for (int s = 0; s < i.length; s++) {
			// 索引不大于长度4
			if (d == i[s]) {
				// 如果等于i的索引就不执行
				System.out.println("数组i的元素:"+d+"-索引："+s);
				// 打印s
			} else {
				continue;
				// 退出循环
			} // if
		} // for循环

	}// main方法

}// class类
