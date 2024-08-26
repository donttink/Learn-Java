package learnlab02;

import java.util.Scanner;

public class BaiTap1 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Nhap a: ");
		float a = scanner.nextInt();
		System.out.println("Nhap b:");
		float b = scanner.nextInt();
		if (a == 0 && b == 0) {
			System.out.println("Phuong trinh co vo so nghiem");
		} else if (a == 0 && b != 0) {
			System.out.println("Phuong trinh vo nghiem");
		} else {
			System.out.println("Nghiem x cua phuong trinh la: " + (-b / a));
		}
	}
}
