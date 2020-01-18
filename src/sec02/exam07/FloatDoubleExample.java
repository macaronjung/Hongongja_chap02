package sec02.exam07;

public class FloatDoubleExample {

	public static void main(String[] args) {
		
		//실수값 저장 float는 실수 리터럴 에러
		//float var1 = 3.14;
		
		//실수값 저장 컴파일러가 float 타입을 알 수 있게 지정
		float var2 = 3.14f;
		
		double var3 = 3.14;
		
		//정밀도 테스트
		float var4 = 0.1234567890123456789f;
		double var5 = 0.1234567890123456789;
		
		//float 타입 약 7번째 자리까지 표시
		System.out.println("var4 : " + var4);
		//double 타입 약 15번째 자리까지 표시
		System.out.println("var5 : " + var5);
		
		//e 제곱 사용하기
		double var6 = 3e6;
		float var7 = 3e6f;
		double var8 = 2e-3;
		
		System.out.println("var6 : " + var6);
		System.out.println("var7 : " + var7);
		System.out.println("var8 : " + var8);

	}

}
