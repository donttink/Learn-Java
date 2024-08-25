package mylab01;

import java.util.Scanner;

public class BaiTap2 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Nhập độ dài cạnh a: ");
		int a = scanner.nextInt();
		System.out.println("Nhập độ dài cạnh b: ");
		int b = scanner.nextInt();
		int p = (a + b) * 2;
		int s = a * b;
		System.out.println("- Chu vi của hình chữ nhật là: " + p);
		System.out.println("- Diện tích của hình chữ nhật là: " + s);
		System.out.println("- Cạnh nhỏ nhất của hình chữ nhật là: " + Math.min(a, b));
	}

}
