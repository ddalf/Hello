package canstore;

public class Car {
	Tire tire;
	
	public Car() {
		tire = new KoreanTire();
		
	}
	public String getTire() {
		return "���� Ÿ�̾�:" + tire.getBrand();
	}
	
}
