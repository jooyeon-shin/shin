package lesson002;

public class BStudenttest {

	public static void main(String[] args) {
		BStudent studentKim = new BStudent("김갑돌", "청주시 상당구", "1001");
		BStudent studentHong = new BStudent("1002");
		
		
		
		studentKim.showinfo();
		studentKim.learn("자바");
		
		studentHong.showinfo();
		studentHong.learn("자바");
	}

}
