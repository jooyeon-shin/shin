package lesson002;

public class AEH {

	public static void main(String[] args) {
		// 

		int[] arr = new int[5];


	try {
		for(int i = 0; i<=5 ; i++) {
			arr[i] = i;
			System.out.println(arr[i]);
		}
		catch(ArrayIndexOutOfBoundsException e) {
	}
		System.out.println("인덱스가 범위를 벗어났습니다.");
		e.printStackTrace();
		catch(SQLException se) 
		System.out.println("프로그램 종료");
		
		

		}
	}

}
