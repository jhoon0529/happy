package sw;

public class ArrayTest {

	public static void main(String[] args) {
		/* 
		 * 배열 홀수 값 더하기
		 * */
		
		int[] n= new int[10];  
		
		int t=3;
		for(int i =1; i<=t;i++) {  //1.2.3
			int sum = 0;
			if(i==1) {
				int a[] =  {3, 17, 1, 39, 8, 41, 2, 32, 99, 2};
				for(int k=0; k < a.length;k++ ) {
					if(a[k]%2 ==1) {
						sum += a[k];
					}
				}
				System.out.println("#"+ i + " " + sum);
			}
			sum = 0;
			if(i==2) {
				int a[] =  {22, 8, 5, 123, 7, 2, 63, 7, 3, 46};
				for(int k=0; k < a.length;k++ ) {
					if(a[k]%2 ==1) {
						sum += a[k];
					}
				}
				System.out.println("#"+ i + " " + sum);
			}
			sum = 0;
			if(i==3) {
				int a[] =  {6, 63, 2, 3, 58, 76, 21, 33, 8, 1};
				for(int k=0; k < a.length;k++ ) {
					if(a[k]%2 ==1) {
						sum += a[k];
					}
				}
				System.out.println("#"+ i + " " + sum);
			}
		}
	}
}
