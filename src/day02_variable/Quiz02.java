package day02_variable;

import java.util.Scanner;

public class Quiz02 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String name;
		int score1,score2,score3;
		System.out.print("����� �̸��� �����Դϱ�?");
		name = input.next();
		System.out.print(name+"���� ���� ����:");
		score1 = input.nextInt();
		System.out.print(name+"���� ���� ����:");
		score2 = input.nextInt();
		System.out.print(name+"���� ���� ����:");
		score3 = input.nextInt();
		int sum=score1+score2+score3;
		System.out.println("================");
		System.out.println("�̸� :"+name);
		System.out.println("================");
		System.out.println("���� :"+score1);
		System.out.println("���� :"+score2);
		System.out.println("���� :"+score3);
		System.out.println("================");
		System.out.println("�հ� :"+sum);
		System.out.println("================");
		
	}
}
