package sec04.exam01;

public class PrintfExample {

	public static void main(String[] args) {
		
		int value = 500;
		
		System.out.printf("��ǰ�� ����:%d��\n", value);
		System.out.printf("��ǰ�� ����:%6d��\n", value);
		System.out.printf("��ǰ�� ����:%-6d��\n", value);
		System.out.printf("��ǰ�� ����:%06d��\n", value);
		
		//x$ ���� �����ϸ� ������� ���� ����
		double area = 3.14159 * 10 * 10;
		System.out.printf("�������� %1$d�� ���� ����:%2$10.2f\n", 10, area);
		
		String name = "�ڹٸ�";
		String job = "���α׷���";
		System.out.printf("%6d / %-10s / %10s\n", 1, name, job);
		

	}

}
