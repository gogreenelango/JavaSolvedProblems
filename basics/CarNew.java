

public class CarNew {
	String model;
	double speed;
	
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public double getSpeed() {
		return speed;
	}
	public void setSpeed(double speed) {
		this.speed = speed;
	}
	//Empty Constructor
	public CarNew(){
		
	}
	//Declaring Methods
	public boolean start(){
		return true;
		
	}
	public double acclerate(double a) {
		speed=a*10;
		return speed; 
	}
	public static void main(String args[])
	{
		//instance variables
		CarNew car1=new CarNew();
		CarNew car2=new CarNew();
		
		double s1=car1.acclerate(2);
		 System.out.println(s1);
		
		car1.speed=20.0;//encapsulation
		car2.speed=10.0;
		
		 System.out.println(car1.speed);
		 System.out.println(car2.speed);
		
	}
	

}
