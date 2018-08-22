package upgrade_carstore;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("car_tire.xml")
class NewCarTest {
	@Autowired //인스턴스 중에  autowired 붙어있는 instance는 일치하면 데이터 자동으로 주입해줌. 데이
	Car car;
	
	@Test
	void test() {
		assertEquals("현재 타이어:한국 타이어", car.getTireBrand());
	}

}
