package Com.JavaPolymorphism;

public class PolyTest {

	public static void main(String[] args) {
		
		PolyTest pt=new PolyTest();
		Taxi taxi=new Taxi();
		Police pc=new Police();
		pt.brake(pc);
		pt.brake(taxi);
		
		
	}
public void brake(Car car) {
	car.brake();
}
}
