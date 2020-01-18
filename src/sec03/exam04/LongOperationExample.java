package sec03.exam04;

public class LongOperationExample {

	public static void main(String[] args) {
		
		byte value1 = 10;
		int value2 = 100;
		
		//숫자+L->long 타입 표시
		long value3 = 1000L;
		long result = value1 + value2 + value3;
		System.out.println(result);

	}

}
