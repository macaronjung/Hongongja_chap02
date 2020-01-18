package sec01.exam03;

public class VariableExchangeExample {

	public static void main(String[] args) {
		
		int x = 3;
		int y = 5;
		
		System.out.println("x:" + x + ", y:" + y);
		
		//temp에 x값 저장, 즉 temp = 3
		int temp = x;
		//x = 5
		x = y;
		//y는 temp에 저장되어 있는 3이 됨
		y = temp;
		
		System.out.println("x:" + x + ", y:" + y);

	}

}
