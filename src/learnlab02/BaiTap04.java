package learnlab02;

import java.util.Scanner;

public class BaiTap04 {

	public static void BatTap1() {
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

	public static void BatTap2() {
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

	public static void BatTap3() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Nhap so dien: ");
		int dien = scanner.nextInt();
		int tongtien = dien * 1000;
		if (dien <= 100) {
			System.out.println("Tong so tien dien la: " + tongtien);
		} else
			System.out.println("Tong so tien dien la: " + (100 * 1000 + (dien - 100) * 1500));
	}

	public static void main(String[] args) {
		System.out.println(">> LỰA CHỌN TÍNH NĂNG <<");
		System.out.println("++ ----------------------------------------- ++");
		System.out.println("| 1. Giải phương trình bậc nhất |");
		System.out.println("| 2. Giải phương trình bậc hai |");
		System.out.println("| 3. Tính số tiền điện |");
		System.out.println("| 4. Kết thúc |");
		System.out.println("++ ------------------ ++");
		Scanner scanner = new Scanner(System.in);
		System.out.println("Lựa chọn của bạn là : ");
		int chon = scanner.nextInt();
		switch (chon) {
		case 1:
			System.out.println("Ban da lua chon giai phuong trinh bac nhat");
			BatTap1();
			break;
		case 2:
			System.out.println("Ban da lua chon giai phuong trinh bac hai");
			BatTap2();
			break;
		case 3:
			System.out.println("Ban da lua chon tinh so dien");
			BatTap3();
			break;
		default:
			System.out.println("Ban da lua chon thoat chuong trinh");
			System.exit(0);
		}
		scanner.close();
	}
}
