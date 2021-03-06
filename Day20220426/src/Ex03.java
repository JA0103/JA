
public class Ex03 {

	public static void main(String[] args) {

		Car c1 = new Car();
		Car c2 = new Car();
		Car c3 = new Car();
		c1.num++;
		
		System.out.println(c1.num);
		System.out.println(c2.num);
		System.out.println(c3.num);
		
		//Car2 c4 = new Car2();  -->private Car2() =>private 이기 때문에 읽지 못해 에러.
		
		Car2 c4 = Car2.getInstance();
		System.out.println(c4.num);
		
	}

}


class Car{
	int num =10;
	
	public Car() {
		
	}
}



class Car2{

	private static Car2 car2 = null;
	
	int num =100;
	
	private Car2() {   //private 
		
	}
	
	public static Car2 getInstance() {  // *싱글톤* (아래설명)
		if(car2 == null)
			car2 = new Car2();  //생성자 호출
		return car2;
	}
}

/*
 * 1.일반적으로 객체 생성할때 생성자 통해서 객체 생성
 * 2.싱글톤은 생성자 private >> 외부 접근 금지
 * 3. 어떨게 접근할 것인가? ==> getInstance 메소드에서 객체를 생성하고 있다.
 * 4.외부에서 객체를 생성하려면 getInstance 통해서만 가능하다.
 * 5.getInstance도 메소드이기 때문에 외부에서 접근하려면 객체를 생성하고 접근해야한다.
 * 6.static 메소드는 객체를 생성하지 않고서도 접근 가능하다.
 * 따라서 getInstance를 static 메소드로 변경한다.
 * 7.getInstance static 메소드에서 객체를 생성해서 참조변수 car2에게 생성된 객체 주소값을
 * 넘겨준다.
 * 8.Car2 car2 이 아이는 어떻게 설정해야하는가? ==> static
 */