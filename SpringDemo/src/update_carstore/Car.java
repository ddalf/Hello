package update_carstore;

import canstore.Tire;

public class Car {
	Tire tire;
	
	public void setTire(Tire tire) {
		this.tire = tire;
	}

	public String getTireBrand() {
		return "���� Ÿ�̾�:"+tire.getBrand();
	}

	public Tire getTire() {
		return tire;
	}
}
