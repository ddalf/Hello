package update_carstore;

public class Factory {
	public static void main(String[] args) {
		Tire tire = new KoreanTire();
		Car car = new Car();
		car.setTire(tire);
		
		System.out.println(car.getTireBrand());
	}
}
