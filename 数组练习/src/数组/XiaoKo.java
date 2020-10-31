package 数组;

public class XiaoKo {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
	
		int[] i= {33,22,33,44,55,11};
		int small=100;
		//数组
		for(int index=0;index<i.length;index++) {
			//index索引
			if(small>i[index]) {
		    small=i[index];
			}
			//数组赋值给small
			}
			System.out.println("最小："+small);
			//small返回
		}	
	}


