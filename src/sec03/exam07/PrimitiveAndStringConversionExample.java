package sec03.exam07;

public class PrimitiveAndStringConversionExample {

	public static void main(String[] args) {
		
		
		//���ڿ��� �⺻ Ÿ������ ���� ��ȯ
		int value1 = Integer.parseInt("10");
		System.out.println(value1);
		
		double value2 = Double.parseDouble("3.14");
		System.out.println(value2);
		
		boolean value3 = Boolean.parseBoolean("true");
		System.out.println(value3);
		
		//�⺻ Ÿ���� ���ڿ��� ���� ��ȯ
		String str1 = String.valueOf(10);
		System.out.println(str1);
		
		String str2 = "" + 3.14;
		System.out.println(str2);
		
		String str3 = String.valueOf(true);
		System.out.println(str3);

	}

}
