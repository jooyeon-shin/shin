package lesson001;

public class P001 {

	public static void main(String[] args) {

		int cnum = 3;
		int hnum = 1;

		if(cnum == 1) {
			if(hnum == 2) {
				System.out.println("승리");
			}else if(hnum == 1) {
				System.out.println("무승부");
			}
			else {
				System.out.println("패배");
			}
		}
		else if(cnum == 2) {
			if(hnum == 3) {
				System.out.println("승리");
			}else if(hnum == 2) {
				System.out.println("무승부");
			}
			else {
				System.out.println("패배");
			}
		}
			else if(cnum == 3) {
				if(hnum == 2) {
					System.out.println("승리");
				}else if(hnum == 3) {
					System.out.println("무승부");
				}
				else {
					System.out.println("패배");
				}
			}
		}//main
	}//class