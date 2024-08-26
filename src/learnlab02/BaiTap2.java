package learnlab02;

import java.util.Scanner;

public class BaiTap2 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Nhap a: ");
		float a = scanner.nextInt();
		System.out.println("Nhap b:");
		float b = scanner.nextInt();
		System.out.println("Nhap c:");
		float c = scanner.nextInt();
		System.out.printf("Giai phuong trinh bac 2 %.1fx^2 + %.1fx + %.1f:\n", a, b, c);
		if (a == 0) {
			System.out.println("Phuong trinh co vo so nghiem");
		} else {
			float delta = (float) Math.pow(b, 2) - (4 * a * c);
			if (delta > 0) {
				float x1 = (-b + (float) Math.sqrt(delta)) / (2 * a);
				float x2 = (-b - (float) Math.sqrt(delta)) / (2 * a);
				System.out.printf("Phuong trinh co 2 nghiem phan biet la: %.1f va %.1f", x1, x2);
			} else if (delta == 0) {
				float x = -b / (2 * a);
				System.out.printf("Phuong trinh co nghiem kep x1 = x2 = %.1f", x);
			} else
				System.out.println("Phuong trinh vo nghiem");
		}
	}
}
