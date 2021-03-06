package lesson001;

public class E015_Array2D {

	public static void main(String[] args) {
		int [] arry1d;
		int [][] arry2d;

		arry1d = new int[] {1,2,3};  // 선언된 배열에 값 초기화
		arry2d = new int[][] {
			{1,2,3},
			{4,5,6,},
			{7,8,9}
		};
		// 개별 요소에의 접근은 index 사용
		for(int i =0; i < arry1d.length ; i++) {
			//System.out.println(arry1d[i]);
			System.out.printf("%3d ", arry1d[i]);
		}
		System.out.println();// 줄바꿈용

		// 2차원 배열 요소에 대한 접근
		// nested for loop 사용
		for(int row = 0; row < arry2d.length; row++) {
			for(int col = 0; col < arry2d[row].length; col++) {
				// arry2d[row][col]
				System.out.printf("%3d ", arry2d[row][col]);
			}
		}
	}
}