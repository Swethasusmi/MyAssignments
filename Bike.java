package week1.day1;

class Car {
	void applyBreak(){
		System.out.println("Applied Break");
	}

	void soundHorn(){
		System.out.println("sound horn");
	}
}

public class Bike extends Car {
	public static void main(String[] args) {
		Car c_obj=new Car();
		Bike b_obj=new Bike();
		c_obj.soundHorn();
		b_obj.applyBreak();
		b_obj.soundHorn();
		c_obj.applyBreak();
		}
}
