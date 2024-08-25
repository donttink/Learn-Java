package mylab01;

import java.util.Scanner;

public class BaiTap {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Nhập tên sinh viên:");
		String ten = scanner.nextLine();
		System.out.println("Nhập điểm trung bình của sinh viên: ");
		float diem = scanner.nextFloat();
		System.out.println("" + ten + " có điểm = " + diem);
	}
}
