package mylab01;

import java.util.Scanner;

public class BaiTap3 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Nhập độ dài một cạnh: ");
		int a = scanner.nextInt();
		System.out.println("Thể tích của khối lập phương là: " + Math.pow(a, 3));
	}
}
