package sec04.exam02;

public class KeyCodeExample {

	/*throws Exception->���� ó�� �ڵ�(�ܼ��� ����Ϳ� ���� ������ �����)
	 read �ڵ� ���� ���� �߻� ���ɼ� ������ ��� 	*/
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
