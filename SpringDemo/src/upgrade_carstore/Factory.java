package upgrade_carstore;

import org.apache.catalina.core.ApplicationContext;

public class Factory {
	public static void main(String[] args) {
		ApplicationContext context 
			= new FileSystemXmlApplicationContext("");
		
		Tire tire = (Tire)context.getBean("tire");
		Car car= (Car)context.getBean("car");
		car.setTire(tire);
		
		System.out.println(car.getTireBrand());
	}
}
