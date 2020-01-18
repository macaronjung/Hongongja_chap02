package sec02.exam04;

public class CharExample {

	public static void main(String[] args) {
		
		//문자를 직접 저장
		char c1 = 'A';
		//10진수로 저장
		char c2 = 65;
		//16진수로 저장(유니코드를 이렇게는 사용 잘 안함)
		char c3 = '\u0041';
		
		char c4 = '가';
		char c5 = 44032;
		char c6 = '\uac00';
		
		System.out.println(c1);
		System.out.println(c2);
		System.out.println(c3);
		System.out.println(c4);
		System.out.println(c5);
		System.out.println(c6);

	}

}
