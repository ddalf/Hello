
package canstore;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Test;

class CartTest {

	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	void test() {
		Car car = new Car();
		assertEquals("���� Ÿ�̿�:�ѱ� Ÿ�̾�",car.getTire());
	}

}
