package sec03.exam03;

public class ByteOperationExample {

	public static void main(String[] args) {
		
		//타입 미지정 후 연산 실행시 변환 불필요(컴파일러 연산)
		byte result = 10 + 20;
		System.out.println(result);
		
		//타입 지정 후 연산 실행시 결과값 자동 int 변환(JVM 연산)
		byte x = 10;
		byte y = 20;
		int result2 = x + y;
		System.out.println(result2);

	}

}
