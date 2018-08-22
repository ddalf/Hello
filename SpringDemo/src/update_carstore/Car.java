package update_carstore;

import canstore.Tire;

public class Car {
	Tire tire;
	
	public void setTire(Tire tire) {
		this.tire = tire;
	}

	public String getTireBrand() {
		return "현재 타이어:"+tire.getBrand();
	}

	public Tire getTire() {
		return tire;
	}
}
