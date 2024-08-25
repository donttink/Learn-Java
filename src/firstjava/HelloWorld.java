package firstjava;

import java.util.Scanner;

public class HelloWorld {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Hello World with Java");
		System.out.println("Hello World with Java");
		System.out.println("Hello World with Java");
		System.out.println("Hello World with Java");
		int a = 6;
		int code = 97;
		int jj97;
		int b = 9;
		int c = a + b;
		int test = 5 + 9 * 3 - 10 / 2;
		System.out.println("Sum: " + c);
		int d = Math.max(6, 9);
		int e = Math.min(6, 9);
		System.out.println("Min is: " + e);
		System.out.println("Max is: " + d);
		System.out.println("Check test: " + test);
		System.out.printf("Chuc mung ban da trung %d!", 500000);
		System.out.printf("\n");
		System.out.println("Your name is: ");
		String name = scanner.nextLine();
		System.out.println("Your age is: ");
		int age = scanner.nextInt();
		System.out.println("My name is " + name + ", age = " + age);
		System.out.printf("Số thứ nhất: ");
		int n1 = scanner.nextInt();
		System.out.printf("Số thứ hai: ");
		int n2 = scanner.nextInt();
		System.out.println("Số lớn nhất là: " + Math.max(n1, n2) + ", Số bé nhất là:" + Math.min(n1, n2));
		scanner.close();
	}
}
