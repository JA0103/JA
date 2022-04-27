
public class ExcerciseAlone {

	public static void main(String[] args) {
		
		Sedan se = new Sedan("white",5,4);

		System.out.println(se.color + ", " + se.passenger + "," + se.tire);
		
		
	}

}

class Car1 {
	int passenger;
	int tire;
	int seat;
	
	public Car1(int passenger, int tire, int seat) {
		this.passenger = passenger;
		this.tire = tire;
		this.seat = seat;
		System.out.println("Car()생성자");
	}
	
	void run() {}
	void stop() {}
}

class Sedan1 extends Car {
	String color;
	
	public Sedan1() {} 
	
	public Sedan1(String color,int passenger, int tire) {
		super(passenger, tire, 4);//-->seat에 왜 값 넣어줘야하는지?=>seat만 값이없어서?
		this.color = color;
		System.out.println("Sedan()생성자");
	}
	
	public Sedan1(int passenger, int tire, int seat, String color) {
		super(passenger, tire, seat);
		this.color = color;
	}
	
}

class Sports1 extends Sedan {
	int sports;
	
	public Sports1() {}
	
	public Sports1(int passenger, int tire, int seat, String color, int sports) {
		super(passenger, tire, seat, color);
		this.sports = sports;
	}
	
	
}
