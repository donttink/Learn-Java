package learnlab02;

import java.util.Scanner;

public class Ex03 {
	public static void main(String[] args) {
		System.out.println(">> LỰA CHỌN TÍNH NĂNG <<");
		System.out.println("++ ------------------ ++");
		System.out.println("| 1. Cộng |");
		System.out.println("| 2. Trừ |");
		System.out.println("| 3. Kết thúc |");
		System.out.println("++ ------------------ ++");
		Scanner scanner = new Scanner(System.in);
		System.out.println("Lựa chọn của bạn là : ");
		int chon = scanner.nextInt();
		switch (chon) {
		case 1:
			System.out.println("Ban da lua chon phep tinh cong");
			break;
		case 2:
			System.out.println("Ban da lua chon phep tinh tru");
			break;
		default:
			System.out.println("Ban da lua chon thoat chuong trinh");
			System.exit(0);
		}
		scanner.close();
	}
}
