package 方法;

public class Array {

	static void arrayPrint(int[] arr){
		String str="[";
		for(int i=0;i<arr.length;i++) {
			str+=arr[i];
			if(i==arr.length-1) {
				str+="]";
			}else {
				str+=",";
			}
			
		}
		System.out.println(str);
	}
	
	
	
	
	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		int[] d=new int[] {2,3,4,5};
		int[] b= new int[] {1,2,3,4,5,6};
		Array.arrayPrint(b);
		Array.arrayPrint(d);
	}

}
