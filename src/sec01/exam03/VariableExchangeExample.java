package sec01.exam03;

public class VariableExchangeExample {

	public static void main(String[] args) {
		
		int x = 3;
		int y = 5;
		
		System.out.println("x:" + x + ", y:" + y);
		
		//temp�� x�� ����, �� temp = 3
		int temp = x;
		//x = 5
		x = y;
		//y�� temp�� ����Ǿ� �ִ� 3�� ��
		y = temp;
		
		System.out.println("x:" + x + ", y:" + y);

	}

}
