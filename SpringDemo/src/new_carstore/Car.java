package new_carstore;

import canstore.Tire;

public class Car {
	Tire tire;
	
	public Car(Tire tire) {
		this.tire = tire;
	}
	
	public String getTire() {
		return "���� Ÿ�̾�:"+tire.getBrand();
	}
}
