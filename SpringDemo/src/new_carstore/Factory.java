package new_carstore;

public class Factory {
	public static void main(String[] args) {
		Tire tire = new KoreanTire();
		Car car = new Car(tire);
		System.out.println(car.getTire());
	}
}
