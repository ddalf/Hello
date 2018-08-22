package upgrade_carstore;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class Factory {
	public static void main(String[] args) {
		try {
		ApplicationContext context 
			= new FileSystemXmlApplicationContext("/src/main/java/upgrade_carstore/car_tire.xml");
		
		Tire tire = (Tire)context.getBean("tire");
		Car car= (Car)context.getBean("car");
				
		System.out.println(car.getTireBrand());
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}
}
