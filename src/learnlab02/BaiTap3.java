package learnlab02;

import java.util.Scanner;

public class BaiTap3 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Nhap so dien: ");
		int dien = scanner.nextInt();
		int tongtien = dien * 1000;
		if (dien <= 100) {
			System.out.println("Tong so tien dien la: " + tongtien);
		} else
			System.out.println("Tong so tien dien la: " + (100 * 1000 + (dien - 100) * 1500));
	}
}
