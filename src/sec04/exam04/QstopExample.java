package sec04.exam04;

public class QstopExample {

	
	/*throws Exception->���� ó�� �ڵ�(�ܼ��� ����Ϳ� ���� ������ �����)
	 read �ڵ� ���� ���� �߻� ���ɼ� ������ ��� 	*/
	public static void main(String[] args) throws Exception{
		
		int keyCode;
		
		//�ݺ��� ����
		while(true) {
			keyCode = System.in.read();
			System.out.println("keyCode : " + keyCode);
			
			//Q�Է½� ���Ṯ
			if(keyCode == 113) {
				break;
			}

			
		}

		System.out.println("����");

	}

}
