package sec04.exam05;

//java.util ��Ű���� Scanner�� �ִٴ� ���� �����Ϸ����� �˷��ִ� ��Ȱ
import java.util.Scanner;

public class ScannerExample {
	
	/*throws Exception->���� ó�� �ڵ�(�ܼ��� ����Ϳ� ���� ������ �����)
	 read �ڵ� ���� ���� �߻� ���ɼ� ������ ��� 	*/
	public static void main(String[] args) throws Exception{
		
		//��ĳ�� Ŭ���� ���
		Scanner scanner = new Scanner(System.in);
		//���ڿ��̱� ������ String Ÿ�� ����
		String inputData;
		
		//�ݺ��� ���
		while(true) { 
			
			//����Ű ������ �Էµ� ���ڿ��� inputData�� ����
			inputData = scanner.nextLine();
			System.out.println("�Էµ� ���ڿ� : \"" + inputData + "\"");
			
			//���ڿ�(String) Ÿ�� ���� �񱳽� ��� �޼ҵ� (�⺻ Ÿ�� ���� �� == ���)
			if(inputData.equals("q")) {
				break;
			}
		}

		System.out.println("����");
	}
}
