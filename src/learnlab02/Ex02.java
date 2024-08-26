package learnlab02;

import java.util.Scanner;

public class Ex02 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Nhap vao thue ban muon dong");
		int tax = scanner.nextInt();
		if (tax < 10) {
			System.out.println("Khong dong thue");
		} else if (tax >= 10 && tax <= 15) {
			System.out.println("Dong 10% thue");
		} else if (tax > 15 && tax <= 30) {
			System.out.println("Dong 20% thue");
		} else {
			System.out.println("Dong 30% thue");
		}
	}
}
