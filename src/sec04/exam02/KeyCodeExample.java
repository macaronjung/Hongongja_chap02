package sec04.exam02;

public class KeyCodeExample {

	/*throws Exception->예외 처리 코드(단순히 모니터에 예외 내용을 출력함)
	 read 코드 사용시 에러 발생 가능성 때문에 사용 	*/
	public static void main(String[] args) throws Exception{
		
		int keyCode;
		
		keyCode = System.in.read();
		System.out.println("keycode : " + keyCode);
		
		keyCode = System.in.read();
		System.out.println("keycode : " + keyCode);
		
		keyCode = System.in.read();
		System.out.println("keycode : " + keyCode);

	}

}
