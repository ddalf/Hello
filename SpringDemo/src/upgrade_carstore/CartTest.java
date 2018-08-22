
package upgrade_carstore;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Test;

class CartTest {

	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	void testCarWithKoreanTire() {
		Tire tire = new KoreanTire();
		Car car = new Car();
		car.setTire(tire);//setter메소드에 의한 주입 방법
		

		
		
	}

}
