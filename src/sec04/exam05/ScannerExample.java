package sec04.exam05;

//java.util 패키지에 Scanner가 있다는 것을 컴파일러에게 알려주는 역활
import java.util.Scanner;

public class ScannerExample {
	
	/*throws Exception->예외 처리 코드(단순히 모니터에 예외 내용을 출력함)
	 read 코드 사용시 에러 발생 가능성 때문에 사용 	*/
	public static void main(String[] args) throws Exception{
		
		//스캐너 클래스 사용
		Scanner scanner = new Scanner(System.in);
		//문자열이기 때문에 String 타입 설정
		String inputData;
		
		//반복문 사용
		while(true) { 
			
			//엔터키 전까지 입력된 문자열을 inputData에 저장
			inputData = scanner.nextLine();
			System.out.println("입력된 문자열 : \"" + inputData + "\"");
			
			//문자열(String) 타입 동일 비교시 사용 메소드 (기본 타입 동일 비교 == 사용)
			if(inputData.equals("q")) {
				break;
			}
		}

		System.out.println("종료");
	}
}
