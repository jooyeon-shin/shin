package ifexample;

public class IfExample2 {

	public static void main(String[] args) {
		int score = 100;
		int grade;
		if(score <= 100 && score >= 90) {
			grade = A;
			System.out.println("A입니다.");
		}
		else if(score < 90 && score >=80) {
			grade = B;
			System.out.println("B입니다.");
		}
		else if(score < 80 && score >=70) {
			grade = C;
			System.out.println("C입니다.");
		}
		else if(score < 70 && score >= 60) {
			grade = D;
			System.out.println("D입니다.");
		}
		else {
			grade = F;
			System.out.println("F입니다.");
		}
		System.out.println("학점은" + grade + "입니다.");
	}

}
