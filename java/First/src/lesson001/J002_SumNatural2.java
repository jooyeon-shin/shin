package lesson001;

public class J002_SumNatural2 {

	public static void main(String[] args) {

		int num = 50 , i = 1, sum = 0;

		while(i <= num)
		{
			sum += i;
			i++;
		}
		System.out.println("Sum = " + sum);
	}
}
