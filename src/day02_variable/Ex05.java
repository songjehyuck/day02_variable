package day02_variable;

public class Ex05 {
	public static void main(String[] args) {
		final int i = 100;
		//i = 200;
		System.out.println(i);
		
		final String KOREA="대한민국";
		//final은 변수를 상수화 시켜 변화를 더 하지 못하게 한다.
		//문자열은 ""로 묶어준다.
		//KOREA="미국";
		System.out.println(KOREA);
	}
}
