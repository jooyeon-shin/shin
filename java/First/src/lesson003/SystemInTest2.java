package lesson003;

public class SystemInTest2 {

	public static void main(String[] args) {
		System.out.println("단어를 입력하고 엔터를 치세요. 끝내려면 ctrl+z를 눌러주세요");
		int i;
		try {
			while((i=System.in.read()) != -1) {
				System.out.println((char)i);
		} 
		}	catch (Exception e) {
			// TODO: handle exception
			System.out.println("입력처리에서 오류발생");
			e.printStackTrace();
		}
		System.out.println("프로그램 종료...");
		System.exit(0);
		}

	}


