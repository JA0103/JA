
public class BankAccount { //Ŭ����  --> Ŭ���� ����� �߻�ȭ ����
	int balance;
	
	int deposit(int amount) {   //�Ա�
		balance += amount;
		
		return balance;
		
	}
	
	int withdraw(int amount) { //���
		balance -= amount;
		return balance;
	}
	
	void checkBalance() {     //�ܰ�Ȯ��
		System.out.println("�ܾ� : "+ balance);
	}
}

class MainClass{
	public static void main(String[] args) {
		
		//�Ʒ� ȭ��ó�� ����ϱ� ���� ������ ���
		//System.out.println();   --> ���� ��� ����
		
		BankAccount kim = new BankAccount();   //���� ����
		kim.deposit(10000);
		kim.checkBalance();
		
		kim.withdraw(3000);
		kim.checkBalance();
		System.out.println("-------------------------");

		//park
		BankAccount park = new BankAccount();
		park.deposit(5000);
		park.checkBalance();
		
		park.withdraw(500);
		park.checkBalance();
		
		System.out.println("-------------------------");
		//lee
		BankAccount lee = new BankAccount();
		lee.deposit(12000);
		lee.checkBalance();
		
		lee.withdraw(30000);
		lee.checkBalance();
		System.out.println("-------------------------");
		System.out.println("-------------------------");
		
		lee = kim;
		
		lee.checkBalance();
		lee.deposit(10000);
		kim.checkBalance();
		park.checkBalance();
		
		
		
		
	}
}

//�ܾ� : 10000
//�ܾ� : 7000