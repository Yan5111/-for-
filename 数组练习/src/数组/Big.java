package 数组;

public class Big {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		int big=0;
		int[] i= {11,22,33,44,55,66};
		//数组
		for(int ce=0;ce<i.length;ce++) {
			if(big<i[ce]) {
				big=i[ce];
				
			}
			
		}
		System.out.println("最大："+big);
	}

}
