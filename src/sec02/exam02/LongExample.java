package sec02.exam02;

public class LongExample {

	public static void main(String[] args) {
		
		long var1 = 10;
		long var2 = 20L;
		
		/*자바는 기본적으로 숫자를 int인 정수로 판단
		 그래서 int 범위를 넘는 숫자는 뒤에 L로 롱타입 표시 필요
		 */
		//long var3 = 1000000000000;
		long var4 = 1000000000000L;
		
		System.out.println(var1);
		System.out.println(var2);
		System.out.println(var4);

	}

}
