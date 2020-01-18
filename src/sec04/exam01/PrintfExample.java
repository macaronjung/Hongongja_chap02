package sec04.exam01;

public class PrintfExample {

	public static void main(String[] args) {
		
		int value = 500;
		
		System.out.printf("상품의 가격:%d원\n", value);
		System.out.printf("상품의 가격:%6d원\n", value);
		System.out.printf("상품의 가격:%-6d원\n", value);
		System.out.printf("상품의 가격:%06d원\n", value);
		
		//x$ 순번 생략하면 순서대로 연산 실행
		double area = 3.14159 * 10 * 10;
		System.out.printf("반지름이 %1$d인 원의 넓이:%2$10.2f\n", 10, area);
		
		String name = "자바맨";
		String job = "프로그래머";
		System.out.printf("%6d / %-10s / %10s\n", 1, name, job);
		

	}

}
