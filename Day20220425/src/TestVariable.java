class Variables{
	int iv;  // �ν��Ͻ�����, �������   ---> ������
	static int cv;   //Ŭ��������, ��������, ��������   -->  ���� ����
	
	void method() {
		int lv=0;   //��������
		
	}
}

public class TestVariable {

	public static void main(String[] args) {
		
		Variables var = new Variables();
		var.iv++;
		Variables.cv++;   //Ŭ������������ �ν���Ʈ���� �˱� ���� ���� �տ� Ŭ���� �̸����� ���̱�
		System.out.println("var : " + var.iv);   //1
		System.out.println("var_cv : " + var.cv);   //1
		
		Variables var2 = new Variables();
		var2.iv++;
		Variables.cv++;
		System.out.println("var2 : " + var2.iv);  //1
		System.out.println("var_cv : " + var.cv);   //-->2�� ����
		
		Variables var3 = new Variables();
		var3.iv++;
		Variables.cv++;
		System.out.println("var2 : " + var3.iv);  //1
		System.out.println("var_cv : " + var.cv);   //-->2�� ����
		
		System.out.println("-------------------------");
		
		Variables var4 = new Variables();
		System.out.println(var4.iv);  //�ν��Ͻ������� ��ü ���� �� ����ؾ��Ѵ�.
		
		System.out.println(Variables.cv);  //Ŭ���� ������ ��ü �������� �ʰ� ���� ����
										//������ ��ü���� ���� �޸� ���� �ö�����
	}

}

