
public class Tv {
		//���� == �ν��Ͻ�����
		String color;
		boolean power;  //�ν��Ͻ� ����
		int channel;   //ä�� ��ȣ ����
		
		//�޼ҵ� == �ν��Ͻ��޼ҵ�
		void power() {
			power = !power;
		}
		
		void chnnelUp()  {
			++channel;
		}
		
		void channelDown () { 
			--channel;
		}
		
}//class Tv.

class TvTest {
	public static void main (String args[]) {
		//tv��ü �����ʹ�.  --->��ü�� ������� Ŭ����(���赵)�� �־���Ѵ�.
		Tv t;
		t = new Tv();
		t.channel = 7;
		t.channelDown(); 
		System.out.println("���� ä���� " + t.channel + "�Դϴ�.");
	}
	
}//class TvTest.
