package sec03.exam06;

public class StringConcatExample {

	public static void main(String[] args) {
		
		//단순 숫자 연산
		int value = 10 + 2 + 0;
		System.out.println(value);
		
		//문자열 결합 연산
		String str1 = 10 + 2 + "2";
		System.out.println(str1);
		
		String str2 = 10 + "2" + 8;
		System.out.println(str2);
		
		String str3 = "10" + 2 + 8;
		System.out.println(str3);
		
		//괄호 최우선 연산
		String str4 = "10" + (2 + 8);
		System.out.println(str4);

	}

}
