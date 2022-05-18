package p367;


public class Car {
	Tire frontLeftTire = new HankookTire();
	Tire frontRightTire = new HankookTire();
	Tire backLeftRTire = new HankookTire();
	Tire backRightTire = new HankookTire();
	
	void run() {
		frontLeftTire.roll();
		frontRightTire.roll();
		backLeftRTire.roll();
		backRightTire.roll();
	}
}
