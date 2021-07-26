package day02_variable;

import java.util.Scanner;

public class Quiz02 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String name;
		int score1,score2,score3;
		System.out.print("당신의 이름은 무엇입니까?");
		name = input.next();
		System.out.print(name+"님의 국어 점수:");
		score1 = input.nextInt();
		System.out.print(name+"님의 영어 점수:");
		score2 = input.nextInt();
		System.out.print(name+"님의 수학 점수:");
		score3 = input.nextInt();
		int sum=score1+score2+score3;
		System.out.println("================");
		System.out.println("이름 :"+name);
		System.out.println("================");
		System.out.println("국어 :"+score1);
		System.out.println("영어 :"+score2);
		System.out.println("수학 :"+score3);
		System.out.println("================");
		System.out.println("합계 :"+sum);
		System.out.println("================");
		
	}
}
