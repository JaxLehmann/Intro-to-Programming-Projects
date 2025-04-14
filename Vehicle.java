
class Vehicle {
	
	Vehicle() {
		System.out.println("Vehicle constructor");  
	}
	
}

class Car extends Vehicle {
	
	int maxSpeed;

	Car(int maxSpeed) {
		System.out.println("Car constructor");
		this.maxSpeed = maxSpeed;
	}

}

