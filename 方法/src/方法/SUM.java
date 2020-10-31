package 方法;

public class SUM {
	static int som(int i, int i2) {
//修饰符  返回类型 参数类型 （参数名 参数类型 参数名.......）{}
		int so = i + i2;

		return so;// 返回so

	}

	public static void main  (String[] org) {
		int som = SUM.som(3, 4);
		System.out.println(som);
	}
}
