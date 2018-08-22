package new_carstore;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Test;

class CarTest {

	@AfterAll
	static void tearDownAfterClass() throws Exception {
	}	

	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	void testCarWithKoreanTire() {
		Tire tire = new KoreanTire();
		Car car = new Car(tire);
		
		assertEquals("현재 타이어:한국 타이어",car.getTire());
	}

	@Test
	void testCarWithAmericanTire() {
		Tire tire = new AmericanTire();
		Car car = new Car(tire);
		
		assertEquals("현재 타이어:한국 타이어",car.getTire());
	}
}
