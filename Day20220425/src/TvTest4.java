// ¿¹Á¦ 6-4


class Tv3{
	String color;
	boolean power;
	int channel;
	
	void power() { power = !power;}
	void channelUp() { ++channel;}
	void channelDown() { --channel;}
	
}

public class TvTest4 {

	public static void main(String[] args) {
		
		Tv3[] tvArr = new Tv3[3];
		
		for(int i=0; i<tvArr.length;i++) {
			tvArr[i] = new Tv3();
			tvArr[i].channel = i+10;
		}
		
		for(int i=0; i<tvArr.length;i++) {
			tvArr[i].channelUp();
			System.out.printf("tvArr [%d].channel = %d%n",i,tvArr[i].channel);
		}

	}//main

}
