package lesson003;

import java.util.Scanner;

public class LeapYear {

	public static void main(String[] args) {
		// 신주연

		int yearIn;
		boolean leapYear;

		Scanner scan = new Scanner(System.in);
		System.out.print("연도를 입력해주세요: ");
		yearIn = scan.nextInt();
		System.out.println();

		if(yearIn%4 == 0) {
			if(yearIn%400 == 0) {
				leapYear = true;
				System.out.println("당신이 입력한 해는 윤년입니다");
			}
			else if(yearIn%100 == 0) {
				leapYear = false;
				System.out.println("당신이 입력한 해는 평년입니다");
			}
			else {
				leapYear = true;
				System.out.println("당신이 입력한 해는 윤년입니다: ");
			}
		}
	}
}