package com.example.chapter08;

public class CalcEuclideanDist {

	public static void main(String[] args) {
		// 3���� ��ǥ�������� �� �� ������ �Ÿ�
		
		double[] a = { -1,2,3};
		double[] b = { 4,0,-3};
		
		calcEuclideanDist(a,b);
		
	}
	
	public static void calcEuclideanDist(double[] a, double[] b)
		double sum = 0;
		for(int i = 0; i < a.length;i++) {
			sum += Math.pow(a[i]-b[i], 2);
		}
		double distance = Math.sqrt(sum);
		System.out.println("�� �� ������ �Ÿ��� : " + distance);
	}

}
