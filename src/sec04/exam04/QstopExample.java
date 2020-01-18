package sec04.exam04;

public class QstopExample {

	
	/*throws Exception->예외 처리 코드(단순히 모니터에 예외 내용을 출력함)
	 read 코드 사용시 에러 발생 가능성 때문에 사용 	*/
	public static void main(String[] args) throws Exception{
		
		int keyCode;
		
		//반복문 실행
		while(true) {
			keyCode = System.in.read();
			System.out.println("keyCode : " + keyCode);
			
			//Q입력시 종료문
			if(keyCode == 113) {
				break;
			}

			
		}

		System.out.println("종료");

	}

}

