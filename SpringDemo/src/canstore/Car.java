package canstore;

public class Car {
	Tire tire;
	
	public Car() {
		tire = new KoreanTire();
		
	}
	public String getTire() {
		return "현재 타이어:" + tire.getBrand();
	}
	
}
