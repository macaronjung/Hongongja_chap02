package sec04.exam03;

public class ContinueKeyCodeReadExample {

	
	/*throws Exception->���� ó�� �ڵ�(�ܼ��� ����Ϳ� ���� ������ �����)
	 read �ڵ� ���� ���� �߻� ���ɼ� ������ ��� 	*/
	public static void main(String[] args) throws Exception{
		
		int keyCode;
		
		//�ݺ��� ����
		while(true) {
			keyCode = System.in.read();
			System.out.println("keyCode : " + keyCode);
		}

	}

}
