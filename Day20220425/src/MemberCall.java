
class MemberCall {
	
	int iv = 10;
	static int cv = 20;
	
	int iv2 = cv;
	//static int cv2 = iv;    //Ŭ���������� �ν��Ͻ� ������ ����� �� ����
	static int cv2 = new MemberCall().iv;  //��ó�� ��ü�� �����ؾ� ��� ����
	
	static void staticMethod1() {   //��ü ���� �� �޸� ����
		System.out.println(cv);
	//	System.out.println(iv);  //Ŭ���� �޼��忡�� �ν��Ͻ����� ��� �Ұ�
		MemberCall c = new MemberCall();
		System.out.println(c.iv);  //��ü�� ������ �� �ν��Ͻ������� ���� ����
		
	}
	
	void instanveMethod1() {
		System.out.println(cv);
		System.out.println(iv);   ///�ν��Ͻ��޼��忡���� �ν��Ͻ����� �ٷ� ��밡��
	}

	static void staticMethod2() {
		staticMethod1();
		//instanceMethod1();
		MemberCall c = new MemberCall();
		c.instanveMethod1();
	}
	
	void instanceMethod2() {
		staticMethod1();
		instanveMethod1();
	}
}
