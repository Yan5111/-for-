package 数组;

import java.util.Arrays;

public class Fil {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		int[] i= new  int[5];
		Arrays.fill(i,8);
		for(int index=0;index<i.length;index++) {
			System.out.println(index+":"+i[index]);
		}
	}

}
