package upgrade_carstore;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Car {
	/*@Autowired*/
	/*@Resource*/
	@Autowired
	@Qualifier("korean_tire") /*가지고 싶은 이름 가지고 오는 것 지정 가능*/
	Tire tire;
	
/*	public void setTire(Tire tire) {
		this.tire = tire;
	}

	public Tire getTire() {
		return tire;
	}*/

	public String getTireBrand() {
		return "현재 타이어:"+tire.getBrand();
	}
}
